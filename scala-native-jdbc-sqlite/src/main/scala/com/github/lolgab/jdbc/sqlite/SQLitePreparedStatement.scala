package com.github.lolgab.jdbc.sqlite

import com.github.lolgab.jdbc.sqlite.internal.SQLiteOps
import com.github.lolgab.jdbc.sqlite.internal.constants.*
import com.github.lolgab.jdbc.sqlite.internal.structs.*
import com.github.lolgab.jdbc.sqlite.internal.functions.*
import scala.scalanative.unsafe.*
import scala.scalanative.unsigned.*
import java.net.URL
import java.io.InputStream
import java.sql.*
import java.{util => ju}
import java.io.Reader

class SQLitePreparedStatement(
    connection: SQLiteConnection,
    db: Ptr[sqlite3],
    sql: String
) extends SQLiteStatement(connection, db)
    with PreparedStatement {

  def getParameterMetaData(): ParameterMetaData = ???

  def setSQLXML(parameterIndex: Int, xmlObject: SQLXML): Unit = ???

  def setTime(parameterIndex: Int, x: Time): Unit = ???

  def setTime(parameterIndex: Int, x: Time, cal: ju.Calendar): Unit = ???

  def setBinaryStream(parameterIndex: Int, x: InputStream, length: Int): Unit =
    ???

  def setBinaryStream(parameterIndex: Int, x: InputStream, length: Long): Unit =
    ???

  def setBinaryStream(parameterIndex: Int, x: InputStream): Unit = ???

  def setBlob(parameterIndex: Int, x: Blob): Unit = ???

  def setBlob(
      parameterIndex: Int,
      inputStream: InputStream,
      length: Long
  ): Unit = ???

  def setBlob(parameterIndex: Int, inputStream: InputStream): Unit = ???

  def setNClob(parameterIndex: Int, value: NClob): Unit = ???

  def setNClob(parameterIndex: Int, reader: Reader, length: Long): Unit = ???

  def setNClob(parameterIndex: Int, reader: Reader): Unit = ???

  def execute(): Boolean = ???

  def setClob(parameterIndex: Int, x: Clob): Unit = ???

  def setClob(parameterIndex: Int, reader: Reader, length: Long): Unit = ???

  def setClob(parameterIndex: Int, reader: Reader): Unit = ???

  def setNString(parameterIndex: Int, value: String): Unit = ???

  def setRef(parameterIndex: Int, x: Ref): Unit = ???

  def getMetaData(): ResultSetMetaData = ???

  def setRowId(parameterIndex: Int, x: RowId): Unit = ???

  def setShort(parameterIndex: Int, x: Short): Unit = ???

  def setCharacterStream(
      parameterIndex: Int,
      reader: Reader,
      length: Int
  ): Unit = ???

  def setCharacterStream(
      parameterIndex: Int,
      reader: Reader,
      length: Long
  ): Unit = ???

  def setCharacterStream(parameterIndex: Int, reader: Reader): Unit = ???

  def setTimestamp(parameterIndex: Int, x: Timestamp): Unit = ???

  def setTimestamp(parameterIndex: Int, x: Timestamp, cal: ju.Calendar): Unit =
    ???

  def setNull(parameterIndex: Int, sqlType: Int, typeName: String): Unit = ???

  def setDate(parameterIndex: Int, x: Date): Unit = ???

  def setDate(parameterIndex: Int, x: Date, cal: ju.Calendar): Unit = ???

  def setByte(parameterIndex: Int, x: Byte): Unit = ???

  def setURL(parameterIndex: Int, x: URL): Unit = ???

  def setUnicodeStream(parameterIndex: Int, x: InputStream, length: Int): Unit =
    ???

  def setAsciiStream(parameterIndex: Int, x: InputStream, length: Int): Unit =
    ???

  def setAsciiStream(parameterIndex: Int, x: InputStream, length: Long): Unit =
    ???

  def setAsciiStream(parameterIndex: Int, x: InputStream): Unit = ???

  def setObject(parameterIndex: Int, x: Object, targetSqlType: Int): Unit = ???

  def setObject(parameterIndex: Int, x: Object): Unit = ???

  def setObject(
      parameterIndex: Int,
      x: Object,
      targetSqlType: Int,
      scaleOrLength: Int
  ): Unit = ???

  def setArray(parameterIndex: Int, x: java.sql.Array): Unit = ???

  def addBatch(): Unit = ???

  def setBigDecimal(parameterIndex: Int, x: java.math.BigDecimal): Unit = ???

  def setNCharacterStream(
      parameterIndex: Int,
      value: Reader,
      length: Long
  ): Unit = ???

  def setNCharacterStream(parameterIndex: Int, value: Reader): Unit = ???

  private var stmt: Ptr[sqlite3_stmt] = null
  private var currentResultSet: SQLiteResultSet = null

  locally {
    Zone {
      SQLiteOps.createStatementHandle(db, sql)
    }
  }

  def executeQuery(): ResultSet = {
    checkClosed()
    closeCurrentResultSet()

    val result = sqlite3_step(stmt)
    if (result != SQLITE_ROW && result != SQLITE_DONE) {
      throw SQLException("Failed to execute query")
    }

    currentResultSet = SQLiteResultSet(this, stmt)
    currentResultSet
  }

  def executeUpdate(): Int = {
    checkClosed()
    closeCurrentResultSet()

    val result = sqlite3_step(stmt)
    if (result != SQLITE_DONE) {
      throw SQLException("Failed to execute update")
    }

    sqlite3_reset(stmt)
    sqlite3_changes(db)
  }

  def setString(parameterIndex: Int, x: String): Unit = {
    checkClosed()
    Zone {
      SQLiteOps.bindString(stmt, parameterIndex, x)
    }
  }

  def setInt(parameterIndex: Int, x: Int): Unit = {
    checkClosed()
    SQLiteOps.bindInt(stmt, parameterIndex, x)
  }

  def setLong(parameterIndex: Int, x: Long): Unit = {
    checkClosed()
    SQLiteOps.bindLong(stmt, parameterIndex, x)
  }

  def setDouble(parameterIndex: Int, x: Double): Unit = {
    checkClosed()
    SQLiteOps.bindDouble(stmt, parameterIndex, x)
  }

  def setFloat(parameterIndex: Int, x: Float): Unit = {
    checkClosed()
    SQLiteOps.bindDouble(stmt, parameterIndex, x.toDouble)
  }

  def setBoolean(parameterIndex: Int, x: Boolean): Unit = {
    checkClosed()
    SQLiteOps.bindInt(stmt, parameterIndex, if (x) 1 else 0)
  }

  def setNull(parameterIndex: Int, sqlType: Int): Unit = {
    checkClosed()
    val result = sqlite3_bind_null(stmt, parameterIndex)
    if (result != SQLITE_OK) {
      throw SQLException(
        s"Failed to bind null to parameter $parameterIndex"
      )
    }
  }

  def setBytes(parameterIndex: Int, x: scala.Array[Byte]): Unit = {
    checkClosed()
    Zone {
      SQLiteOps.bindBytes(stmt, parameterIndex, x)
    }
  }

  def clearParameters(): Unit = {
    checkClosed()
    val result = sqlite3_clear_bindings(stmt)
    if (result != SQLITE_OK) {
      throw SQLException("Failed to clear parameters")
    }
  }

  override def close(): Unit = {
    if (!isClosed()) {
      closeCurrentResultSet()
      super.close()
    }
  }

  private def closeCurrentResultSet(): Unit = {
    if (currentResultSet != null) {
      currentResultSet.close()
      currentResultSet = null
    }
  }
}
