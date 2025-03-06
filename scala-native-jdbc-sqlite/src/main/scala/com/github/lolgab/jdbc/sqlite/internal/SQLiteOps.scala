package com.github.lolgab.jdbc.sqlite.internal

import java.sql.SQLException

import scala.scalanative.unsafe.*
import scala.scalanative.unsigned.*

import aliases.*
import constants.*
import structs.*
import functions.*

object SQLiteOps {
  def createStatementHandle(db: Ptr[sqlite3], sql: String)(using
      Zone
  ): Ptr[sqlite3_stmt] = {
    val stmtPtr = alloc[Ptr[sqlite3_stmt]]()
    val result =
      sqlite3_prepare_v3(db, toCString(sql), -1, 0.toUInt, stmtPtr, null)
    if (result != SQLITE_OK) {
      throw SQLException(s"Failed to prepare statement: $sql")
    }
    !stmtPtr
  }

  def withStatement[A](db: Ptr[sqlite3], sql: String)(
      f: Ptr[sqlite3_stmt] => A
  )(using Zone): A = {
    val stmt = createStatementHandle(db, sql)
    try {
      f(stmt)
    } finally {
      println(s"finalizing statement $stmt")
      sqlite3_finalize(stmt)
    }
  }

  def step(stmt: Ptr[sqlite3_stmt]): Boolean = {
    val result = sqlite3_step(stmt)
    result match {
      case SQLITE_ROW  => true
      case SQLITE_DONE => false
      case _ => throw SQLException(s"Error executing statement: $result")
    }
  }

  def getString(stmt: Ptr[sqlite3_stmt], col: Int): String = {
    val cstr = sqlite3_column_text(stmt, col)
    if (cstr == null) null
    else fromCString(cstr.asInstanceOf[CString])
  }

  def getInt(stmt: Ptr[sqlite3_stmt], col: Int): Int = {
    sqlite3_column_int(stmt, col)
  }

  def getLong(stmt: Ptr[sqlite3_stmt], col: Int): Long = {
    sqlite3_column_int64(stmt, col).value
  }

  def getDouble(stmt: Ptr[sqlite3_stmt], col: Int): Double = {
    sqlite3_column_double(stmt, col)
  }

  def getBytes(stmt: Ptr[sqlite3_stmt], col: Int): scala.Array[Byte] = {
    val blob = sqlite3_column_blob(stmt, col)
    val size = sqlite3_column_bytes(stmt, col)
    if (blob == null) null
    else {
      val arr = new scala.Array[Byte](size)
      for (i <- 0 until size) {
        arr(i) = !(blob + i)
      }
      arr
    }
  }

  def bindString(stmt: Ptr[sqlite3_stmt], idx: Int, value: String)(using
      Zone
  ): Unit =
    checkResult(
      if (value == null) {
        sqlite3_bind_null(stmt, idx)
      } else
        sqlite3_bind_text(stmt, idx, toCString(value), -1, SQLITE_TRANSIENT)
    )

  def bindInt(stmt: Ptr[sqlite3_stmt], idx: Int, value: Int): Unit = {
    checkResult(sqlite3_bind_int(stmt, idx, value))
  }

  def bindLong(stmt: Ptr[sqlite3_stmt], idx: Int, value: Long): Unit = {
    checkResult(sqlite3_bind_int64(stmt, idx, sqlite_int64(value)))
  }

  def bindDouble(stmt: Ptr[sqlite3_stmt], idx: Int, value: Double): Unit = {
    checkResult(sqlite3_bind_double(stmt, idx, value))
  }

  def bindBytes(stmt: Ptr[sqlite3_stmt], idx: Int, value: scala.Array[Byte])(
      using Zone
  ): Unit = {
    if (value == null) {
      checkResult(sqlite3_bind_null(stmt, idx))
    } else {
      val ptr = alloc[Byte](value.length)
      for (i <- value.indices) {
        !(ptr + i) = value(i)
      }
      checkResult(
        sqlite3_bind_blob(stmt, idx, ptr, value.length, SQLITE_TRANSIENT)
      )
    }
  }

  private def checkResult(result: Int): Unit = {
    if (result != SQLITE_OK) {
      throw SQLException(s"SQLite operation failed with code: $result")
    }
  }
}
