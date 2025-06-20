package com.github.lolgab.jdbc.duckdb

import java.sql.{Statement, ResultSet, SQLException}
import com.github.lolgab.jdbc.duckdb.internal.duckdb.all.*
import scala.scalanative.unsafe.*
import scala.scalanative.unsigned.*
import scala.scalanative.libc.stdlib.*
import java.sql.SQLWarning
import java.sql.Connection

class DuckDBStatement(
    connection: DuckDBConnection,
    conn: Ptr[duckdb_connection]
) extends Statement {

  override def execute(sql: String, autoGeneratedKeys: Int): Boolean = ???

  override def execute(sql: String, columnIndexes: Array[Int]): Boolean = ???

  override def execute(sql: String, columnNames: Array[String]): Boolean = ???

  override def getFetchDirection(): Int = ???

  override def getMoreResults(current: Int): Boolean = ???

  override def executeBatch(): Array[Int] = ???

  override def setFetchDirection(direction: Int): Unit = ???

  override def clearWarnings(): Unit = ???

  override def executeUpdate(sql: String, autoGeneratedKeys: Int): Int = ???

  override def executeUpdate(sql: String, columnIndexes: Array[Int]): Int = ???

  override def executeUpdate(sql: String, columnNames: Array[String]): Int = ???

  override def clearBatch(): Unit = ???

  override def getFetchSize(): Int = ???

  override def setFetchSize(rows: Int): Unit = ???

  override def getResultSetConcurrency(): Int = ???

  override def getResultSetType(): Int = ???

  override def isPoolable(): Boolean = ???

  override def closeOnCompletion(): Unit = ???

  override def setEscapeProcessing(enable: Boolean): Unit = ???

  override def setMaxFieldSize(max: Int): Unit = ???

  override def getMaxFieldSize(): Int = ???

  override def getConnection(): Connection = ???

  override def getResultSetHoldability(): Int = ???

  override def addBatch(sql: String): Unit = ???

  override def getGeneratedKeys(): ResultSet = ???

  override def setCursorName(name: String): Unit = ???

  override def getWarnings(): SQLWarning = ???

  override def isCloseOnCompletion(): Boolean = ???

  override def setPoolable(poolable: Boolean): Unit = ???

  override def unwrap[T](iface: Class[T]): T = ???

  override def isWrapperFor(iface: Class[?]): Boolean = ???

  private var currentResultSet: DuckDBResultSet = null
  private var closed = false
  private var maxRows = 0
  private var queryTimeout = 0

  override def executeQuery(sql: String): ResultSet = {
    checkClosed()
    closeCurrentResultSet()

    Zone {
      val result =
        malloc(sizeof[duckdb_result]).asInstanceOf[Ptr[duckdb_result]]
      val state = duckdb_query(!conn, toCString(sql), result)
      if (state == duckdb_state.DuckDBError) {
        val errorMessage = duckdb_result_error(result) match {
          case null   => "Unknown"
          case reason => fromCString(reason)
        }
        duckdb_destroy_result(result)
        throw new SQLException(
          s"Failed to perfrom query: $sql. Reason: $errorMessage"
        )
      }

      currentResultSet = DuckDBResultSet(this, result)
      currentResultSet
    }
  }

  override def executeUpdate(sql: String): Int = {
    checkClosed()
    closeCurrentResultSet()

    Zone {
      val result = alloc[duckdb_result]()
      if (
        duckdb_query(!conn, toCString(sql), result) == duckdb_state.DuckDBError
      ) {
        val errorMessage = duckdb_result_error(result) match {
          case null   => "Unknown"
          case reason => fromCString(reason)
        }
        duckdb_destroy_result(result)
        throw new SQLException(
          s"Failed to perfrom update: $sql. Reason: $errorMessage"
        )
      }

      val res = duckdb_rows_changed(result).toInt
      duckdb_destroy_result(result)
      res
    }
  }

  override def execute(sql: String): Boolean = {
    checkClosed()
    closeCurrentResultSet()

    Zone {
      val state = duckdb_query(!conn, toCString(sql), null)
      state != duckdb_state.DuckDBError
    }
  }

  override def getResultSet(): DuckDBResultSet = {
    checkClosed()
    currentResultSet
  }

  override def getUpdateCount(): Int = {
    checkClosed()
    -1 // TODO
  }

  override def getMoreResults(): Boolean = {
    checkClosed()
    closeCurrentResultSet()
    false // TODO
  }

  override def close(): Unit = {
    if (!closed) {
      closeCurrentResultSet()
      closed = true
    }
  }

  override def setMaxRows(max: Int): Unit = {
    checkClosed()
    if (max < 0) {
      throw SQLException("Max rows must be >= 0")
    }
    maxRows = max
  }

  override def getMaxRows(): Int = {
    checkClosed()
    maxRows
  }

  override def setQueryTimeout(seconds: Int): Unit = {
    checkClosed()
    if (seconds < 0) {
      throw SQLException("Query timeout must be >= 0")
    }
    queryTimeout = seconds
    // Note: DuckDB doesn't have a direct way to set query timeout
    // We would need to implement this using progress callbacks
  }

  override def getQueryTimeout(): Int = {
    checkClosed()
    queryTimeout
  }

  override def cancel(): Unit = {
    checkClosed()
    // DuckDB doesn't support canceling queries
    throw SQLException("Cancel not supported")
  }

  override def isClosed(): Boolean = closed

  protected def checkClosed(): Unit = {
    if (closed) {
      throw SQLException("Statement is closed")
    }
  }

  private def closeCurrentResultSet(): Unit = {
    if (currentResultSet != null) {
      currentResultSet.close()
      currentResultSet = null
    }
  }
}
