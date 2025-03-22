package com.github.lolgab.jdbc.duckdb

import com.github.lolgab.jdbc.duckdb.internal.duckdb.all.*
import scala.scalanative.unsafe.*
import scala.scalanative.unsigned.*
import scala.scalanative.libc.stdlib.*
import java.net.URL
import java.io.InputStream
import java.sql.*
import java.{util => ju}
import java.io.Reader

class DuckDBPreparedStatement(
    connection: DuckDBConnection,
    conn: Ptr[duckdb_connection],
    sql: String
) extends DuckDBStatement(connection, conn)
    with PreparedStatement {

  private val stmt: Ptr[duckdb_prepared_statement] = {
    val _stmt: Ptr[duckdb_prepared_statement] = malloc(sizeof[duckdb_prepared_statement]).asInstanceOf[Ptr[duckdb_prepared_statement]]
    Zone {
      if (duckdb_prepare(!conn, toCString(sql), _stmt) == duckdb_state.DuckDBError) {
        val errorMessage = duckdb_prepare_error(!_stmt) match {
          case null => "Unknown"
          case reason => fromCString(reason)
        }
        throw new SQLException(s"Failed to prepare statement $sql. Reason: $errorMessage")
      }
      _stmt
    }
  }
  private var currentResultSet: DuckDBResultSet = null

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

  def executeQuery(): ResultSet = {
    checkClosed()
    closeCurrentResultSet()

    val result = malloc(sizeof[duckdb_result]).asInstanceOf[Ptr[duckdb_result]]
    val state = duckdb_execute_prepared(!stmt, result)

    if (state == duckdb_state.DuckDBError) {
      val errorMessage = duckdb_result_error(result) match {
        case null => "Unknown"
        case reason => fromCString(reason)
      }
      duckdb_destroy_result(result)
      free(result)
      throw new SQLException(s"Failed to perfrom query: $sql. Reason: $errorMessage")
    }

    currentResultSet = DuckDBResultSet(this, result)
    currentResultSet
  }

  def executeUpdate(): Int = {
    checkClosed()
    closeCurrentResultSet()
    Zone {
      val result = alloc[duckdb_result]()
      val state = duckdb_execute_prepared(!stmt, result)

      if (state == duckdb_state.DuckDBError) {
        val errorMessage = duckdb_result_error(result) match {
          case null => "Unknown"
          case reason => fromCString(reason)
        }
        duckdb_destroy_result(result)
        throw new SQLException(s"Failed to perfrom update: $sql. Reason: $errorMessage")
      }

      val res = duckdb_rows_changed(result).toInt
      duckdb_destroy_result(result)
      res
    }
  }

  def execute(): Boolean = {
    checkClosed()
    closeCurrentResultSet()

    Zone {
      val state = duckdb_execute_prepared(!stmt, null)
      state != duckdb_state.DuckDBError
    }
  }

  def setString(parameterIndex: Int, x: String): Unit = {
    checkClosed()
    Zone {
      if (duckdb_bind_varchar(!stmt, parameterIndex.toUInt, toCString(x)) == duckdb_state.DuckDBError) {
        throw new SQLException(s"Failed to bind string $x to parameter $parameterIndex")
      }
    }
  }

  def setInt(parameterIndex: Int, x: Int): Unit = {
    checkClosed()
    if (duckdb_bind_int32(!stmt, parameterIndex.toUInt, x) == duckdb_state.DuckDBError) {
      throw new SQLException(s"Failed to bind int $x to parameter $parameterIndex")
    }
  }

  def setLong(parameterIndex: Int, x: Long): Unit = {
    checkClosed()
    if (duckdb_bind_int64(!stmt, parameterIndex.toUInt, x) == duckdb_state.DuckDBError) {
      throw new SQLException(s"Failed to bind long $x to parameter $parameterIndex")
    }
  }

  def setDouble(parameterIndex: Int, x: Double): Unit = {
    checkClosed()
    if (duckdb_bind_double(!stmt, parameterIndex.toUInt, x) == duckdb_state.DuckDBError) {
      throw new SQLException(s"Failed to bind double $x to parameter $parameterIndex")
    }
  }

  def setFloat(parameterIndex: Int, x: Float): Unit = {
    checkClosed()
    if (duckdb_bind_float(!stmt, parameterIndex.toUInt, x) == duckdb_state.DuckDBError) {
      throw new SQLException(s"Failed to bind float $x to parameter $parameterIndex")
    }
  }

  def setBoolean(parameterIndex: Int, x: Boolean): Unit = {
    checkClosed()
    if (duckdb_bind_boolean(!stmt, parameterIndex.toUInt, x) == duckdb_state.DuckDBError) {
      throw new SQLException(s"Failed to bind boolean $x to parameter $parameterIndex")
    }
  }

  def setNull(parameterIndex: Int, sqlType: Int): Unit = {
    checkClosed()
    if (duckdb_bind_null(!stmt, parameterIndex.toUInt) == duckdb_state.DuckDBError) {
      throw new SQLException(s"Failed to null to parameter $parameterIndex")
    }
  }

  def setBytes(parameterIndex: Int, x: scala.Array[Byte]): Unit = {
    if (duckdb_bind_blob(!stmt, parameterIndex.toUInt, x.at(0), x.size.toUInt) == duckdb_state.DuckDBError) {
      throw new SQLException(s"Failed to bind byte array to parameter $parameterIndex")
    }
  }

  def clearParameters(): Unit = {
    checkClosed()
    if (duckdb_clear_bindings(!stmt) == duckdb_state.DuckDBError) {
      throw new SQLException(s"Failed to clear bindings")
    }
  }

  override def close(): Unit = {
    if (!isClosed()) {
      closeCurrentResultSet()
      duckdb_destroy_prepare(stmt)
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
