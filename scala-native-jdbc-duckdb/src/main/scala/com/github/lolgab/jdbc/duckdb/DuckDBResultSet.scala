package com.github.lolgab.jdbc.duckdb

import com.github.lolgab.jdbc.duckdb.internal.duckdb.all.*
import com.github.lolgab.jdbc.SimpleResultSet
import java.io.InputStream
import java.io.Reader
import java.net.URL
import java.sql.*
import java.{util => ju}
import scala.scalanative.unsafe.*
import scala.scalanative.unsigned.*
import scala.scalanative.libc.stdlib.*

class DuckDBResultSet(statement: DuckDBStatement, result: Ptr[duckdb_result])
    extends SimpleResultSet {

  override def deleteRow(): Unit = ???

  override def updateInt(columnIndex: Int, x: Int): Unit = ???

  override def updateInt(columnLabel: String, x: Int): Unit = ???

  override def updateShort(columnIndex: Int, x: Short): Unit = ???

  override def updateShort(columnLabel: String, x: Short): Unit = ???

  override def updateFloat(columnIndex: Int, x: Float): Unit = ???

  override def updateFloat(columnLabel: String, x: Float): Unit = ???

  override def getAsciiStream(columnIndex: Int): InputStream = ???

  override def getAsciiStream(columnLabel: String): InputStream = ???

  override def updateBytes(columnIndex: Int, x: scala.Array[Byte]): Unit = ???

  override def updateBytes(columnLabel: String, x: scala.Array[Byte]): Unit =
    ???

  override def updateAsciiStream(
      columnIndex: Int,
      x: InputStream,
      length: Int
  ): Unit = ???

  override def updateAsciiStream(
      columnLabel: String,
      x: InputStream,
      length: Int
  ): Unit = ???

  override def updateAsciiStream(
      columnIndex: Int,
      x: InputStream,
      length: Long
  ): Unit = ???

  override def updateAsciiStream(
      columnLabel: String,
      x: InputStream,
      length: Long
  ): Unit = ???

  override def updateAsciiStream(columnIndex: Int, x: InputStream): Unit = ???

  override def updateAsciiStream(columnLabel: String, x: InputStream): Unit =
    ???

  override def rowDeleted(): Boolean = ???

  override def moveToInsertRow(): Unit = ???

  override def getBlob(columnIndex: Int): Blob = ???

  override def getBlob(columnLabel: String): Blob = ???

  override def last(): Boolean = ???

  override def getSQLXML(columnIndex: Int): SQLXML = ???

  override def getSQLXML(columnLabel: String): SQLXML = ???

  override def getFetchDirection(): Int = ???

  override def updateRowId(columnIndex: Int, x: RowId): Unit = ???

  override def updateRowId(columnLabel: String, x: RowId): Unit = ???

  override def getHoldability(): Int = ???

  override def updateTime(columnIndex: Int, x: Time): Unit = ???

  override def updateTime(columnLabel: String, x: Time): Unit = ???

  override def updateBlob(columnIndex: Int, x: Blob): Unit = ???

  override def updateBlob(columnLabel: String, x: Blob): Unit = ???

  override def updateBlob(
      columnIndex: Int,
      inputStream: InputStream,
      length: Long
  ): Unit = ???

  override def updateBlob(
      columnLabel: String,
      inputStream: InputStream,
      length: Long
  ): Unit = ???

  override def updateBlob(columnIndex: Int, inputStream: InputStream): Unit =
    ???

  override def updateBlob(columnLabel: String, inputStream: InputStream): Unit =
    ???

  override def updateNCharacterStream(
      columnIndex: Int,
      x: Reader,
      length: Long
  ): Unit = ???

  override def updateNCharacterStream(
      columnLabel: String,
      reader: Reader,
      length: Long
  ): Unit = ???

  override def updateNCharacterStream(columnIndex: Int, x: Reader): Unit = ???

  override def updateNCharacterStream(
      columnLabel: String,
      reader: Reader
  ): Unit = ???

  override def getNCharacterStream(columnIndex: Int): Reader = ???

  override def getNCharacterStream(columnLabel: String): Reader = ???

  override def setFetchDirection(direction: Int): Unit = ???

  override def updateNString(columnIndex: Int, nString: String): Unit = ???

  override def updateNString(columnLabel: String, nString: String): Unit = ???

  override def updateBigDecimal(
      columnIndex: Int,
      x: java.math.BigDecimal
  ): Unit = ???

  override def updateBigDecimal(
      columnLabel: String,
      x: java.math.BigDecimal
  ): Unit = ???

  override def getObject(columnIndex: Int): Object = ???

  override def getObject(columnLabel: String): Object = ???

  override def getObject(
      columnIndex: Int,
      map: ju.Map[String, Class[?]]
  ): Object = ???

  override def getObject(
      columnLabel: String,
      map: ju.Map[String, Class[?]]
  ): Object = ???

  override def getObject[T](columnIndex: Int, `type`: Class[T]): T = ???

  override def getObject[T](columnLabel: String, `type`: Class[T]): T = ???

  override def updateSQLXML(columnIndex: Int, xmlObject: SQLXML): Unit = ???

  override def updateSQLXML(columnLabel: String, xmlObject: SQLXML): Unit = ???

  override def absolute(row: Int): Boolean = ???

  override def updateNull(columnIndex: Int): Unit = ???

  override def updateNull(columnLabel: String): Unit = ???

  override def isClosed(): Boolean = ???

  override def getMetaData(): ResultSetMetaData = ???

  override def updateRow(): Unit = ???

  override def getDate(columnIndex: Int): Date = ???

  override def getDate(columnLabel: String): Date = ???

  override def getDate(columnIndex: Int, cal: ju.Calendar): Date = ???

  override def getDate(columnLabel: String, cal: ju.Calendar): Date = ???

  override def moveToCurrentRow(): Unit = ???

  override def getRowId(columnIndex: Int): RowId = ???

  override def getRowId(columnLabel: String): RowId = ???

  override def updateClob(columnIndex: Int, x: Clob): Unit = ???

  override def updateClob(columnLabel: String, x: Clob): Unit = ???

  override def updateClob(
      columnIndex: Int,
      reader: Reader,
      length: Long
  ): Unit = ???

  override def updateClob(
      columnLabel: String,
      reader: Reader,
      length: Long
  ): Unit = ???

  override def updateClob(columnIndex: Int, reader: Reader): Unit = ???

  override def updateClob(columnLabel: String, reader: Reader): Unit = ???

  override def beforeFirst(): Unit = ???

  override def updateBinaryStream(
      columnIndex: Int,
      x: InputStream,
      length: Int
  ): Unit = ???

  override def updateBinaryStream(
      columnLabel: String,
      x: InputStream,
      length: Int
  ): Unit = ???

  override def updateBinaryStream(
      columnIndex: Int,
      x: InputStream,
      length: Long
  ): Unit = ???

  override def updateBinaryStream(
      columnLabel: String,
      x: InputStream,
      length: Long
  ): Unit = ???

  override def updateBinaryStream(columnIndex: Int, x: InputStream): Unit = ???

  override def updateBinaryStream(columnLabel: String, x: InputStream): Unit =
    ???

  override def updateTimestamp(columnIndex: Int, x: Timestamp): Unit = ???

  override def updateTimestamp(columnLabel: String, x: Timestamp): Unit = ???

  override def clearWarnings(): Unit = ???

  override def updateLong(columnIndex: Int, x: Long): Unit = ???

  override def updateLong(columnLabel: String, x: Long): Unit = ???

  override def insertRow(): Unit = ???

  override def cancelRowUpdates(): Unit = ???

  override def relative(rows: Int): Boolean = ???

  override def updateString(columnIndex: Int, x: String): Unit = ???

  override def updateString(columnLabel: String, x: String): Unit = ???

  override def getByte(columnIndex: Int): Byte = ???

  override def getByte(columnLabel: String): Byte = ???

  override def getFetchSize(): Int = ???

  override def rowInserted(): Boolean = ???

  override def getCharacterStream(columnIndex: Int): Reader = ???

  override def getCharacterStream(columnLabel: String): Reader = ???

  override def getConcurrency(): Int = ???

  override def getStatement(): Statement = ???

  override def afterLast(): Unit = ???

  override def first(): Boolean = ???

  override def getArray(columnIndex: Int): Array = ???

  override def getArray(columnLabel: String): Array = ???

  override def getCursorName(): String = ???

  override def updateObject(
      columnIndex: Int,
      x: Object,
      scaleOrLength: Int
  ): Unit = ???

  override def updateObject(columnIndex: Int, x: Object): Unit = ???

  override def updateObject(
      columnLabel: String,
      x: Object,
      scaleOrLength: Int
  ): Unit = ???

  override def updateObject(columnLabel: String, x: Object): Unit = ???

  override def getWarnings(): SQLWarning = ???

  override def setFetchSize(rows: Int): Unit = ???

  override def updateBoolean(columnIndex: Int, x: Boolean): Unit = ???

  override def updateBoolean(columnLabel: String, x: Boolean): Unit = ???

  override def updateCharacterStream(
      columnIndex: Int,
      x: Reader,
      length: Int
  ): Unit = ???

  override def updateCharacterStream(
      columnLabel: String,
      reader: Reader,
      length: Int
  ): Unit = ???

  override def updateCharacterStream(
      columnIndex: Int,
      x: Reader,
      length: Long
  ): Unit = ???

  override def updateCharacterStream(
      columnLabel: String,
      reader: Reader,
      length: Long
  ): Unit = ???

  override def updateCharacterStream(columnIndex: Int, x: Reader): Unit = ???

  override def updateCharacterStream(
      columnLabel: String,
      reader: Reader
  ): Unit = ???

  override def getType(): Int = ???

  override def getURL(columnIndex: Int): URL = ???

  override def getURL(columnLabel: String): URL = ???

  override def getBinaryStream(columnIndex: Int): InputStream = ???

  override def getBinaryStream(columnLabel: String): InputStream = ???

  override def updateNClob(columnIndex: Int, nClob: NClob): Unit = ???

  override def updateNClob(columnLabel: String, nClob: NClob): Unit = ???

  override def updateNClob(
      columnIndex: Int,
      reader: Reader,
      length: Long
  ): Unit = ???

  override def updateNClob(
      columnLabel: String,
      reader: Reader,
      length: Long
  ): Unit = ???

  override def updateNClob(columnIndex: Int, reader: Reader): Unit = ???

  override def updateNClob(columnLabel: String, reader: Reader): Unit = ???

  override def updateDate(columnIndex: Int, x: Date): Unit = ???

  override def updateDate(columnLabel: String, x: Date): Unit = ???

  override def getTime(columnIndex: Int): Time = ???

  override def getTime(columnLabel: String): Time = ???

  override def getTime(columnIndex: Int, cal: ju.Calendar): Time = ???

  override def getTime(columnLabel: String, cal: ju.Calendar): Time = ???

  override def getTimestamp(columnIndex: Int): Timestamp = ???

  override def getTimestamp(columnLabel: String): Timestamp = ???

  override def getTimestamp(columnIndex: Int, cal: ju.Calendar): Timestamp = ???

  override def getTimestamp(columnLabel: String, cal: ju.Calendar): Timestamp =
    ???

  override def getNClob(columnIndex: Int): NClob = ???

  override def getNClob(columnLabel: String): NClob = ???

  override def getClob(columnIndex: Int): Clob = ???

  override def getClob(columnLabel: String): Clob = ???

  override def getRef(columnIndex: Int): Ref = ???

  override def getRef(columnLabel: String): Ref = ???

  override def updateByte(columnIndex: Int, x: Byte): Unit = ???

  override def updateByte(columnLabel: String, x: Byte): Unit = ???

  override def previous(): Boolean = ???

  override def rowUpdated(): Boolean = ???

  override def updateDouble(columnIndex: Int, x: Double): Unit = ???

  override def updateDouble(columnLabel: String, x: Double): Unit = ???

  override def updateArray(columnIndex: Int, x: Array): Unit = ???

  override def updateArray(columnLabel: String, x: Array): Unit = ???

  override def getNString(columnIndex: Int): String = ???

  override def getNString(columnLabel: String): String = ???

  override def updateRef(columnIndex: Int, x: Ref): Unit = ???

  override def updateRef(columnLabel: String, x: Ref): Unit = ???

  override def getBigDecimal(
      columnIndex: Int,
      scale: Int
  ): java.math.BigDecimal = ???

  override def getBigDecimal(
      columnLabel: String,
      scale: Int
  ): java.math.BigDecimal = ???

  override def getBigDecimal(columnIndex: Int): java.math.BigDecimal = ???

  override def getBigDecimal(columnLabel: String): java.math.BigDecimal = ???

  override def getUnicodeStream(columnIndex: Int): InputStream = ???

  override def getUnicodeStream(columnLabel: String): InputStream = ???

  override def refreshRow(): Unit = ???

  override def unwrap[T](iface: Class[T]): T = ???

  override def isWrapperFor(iface: Class[?]): Boolean = ???

  private var _closed = false
  private var _lastWasNull = false
  private var _chunkNum = 0
  private var _row = 0
  private var _isBeforeFirst = true
  private var _isAfterLast = false
  private var _currentChunk: Ptr[duckdb_data_chunk] = null
  private var _chunkIdx: idx_t = 0.toULong

  override def next(): Boolean = {
    checkClosed()
    if (isAfterLast) {
      false
    } else if (
      _currentChunk != null && _chunkIdx < duckdb_data_chunk_get_size(
        !_currentChunk
      ) - 1.toULong
    ) {
      _row = _row + 1
      _chunkIdx = _chunkIdx + 1.toULong
      true
    } else {
      if (_currentChunk != null) duckdb_destroy_data_chunk(_currentChunk)
      duckdb_fetch_chunk(result) match {
        case chunk if chunk.value == null =>
          _isBeforeFirst = false
          _isAfterLast = true
          _currentChunk = null
          _chunkIdx = 0.toULong
          false
        case chunk =>
          val rowCount = duckdb_data_chunk_get_size(chunk)
          _isBeforeFirst = false
          _row += 1
          _currentChunk = malloc(sizeOf[duckdb_data_chunk])
            .asInstanceOf[Ptr[duckdb_data_chunk]]
          !_currentChunk = chunk
          _chunkIdx = 0.toULong
          true
      }
    }
  }

  override def close(): Unit = {
    if (!_closed) {
      duckdb_destroy_result(result)
      _closed = true
    }
  }

  override def isBeforeFirst(): Boolean = {
    checkClosed()
    _isBeforeFirst
  }

  override def isAfterLast(): Boolean = {
    checkClosed()
    _isAfterLast
  }

  override def isFirst(): Boolean = {
    checkClosed()
    _chunkNum == 1 && !_isBeforeFirst && !_isAfterLast
  }

  override def isLast(): Boolean = {
    checkClosed()
    !_isBeforeFirst && !_isAfterLast && _currentChunk == null
  }

  override def getRow(): Int = {
    checkClosed()
    if (_isBeforeFirst || _isAfterLast) 0 else _row
  }

  override def getString(columnIndex: Int): String = {
    checkClosed()
    checkColumnIndex(columnIndex)
    val column =
      duckdb_data_chunk_get_vector(!_currentChunk, (columnIndex - 1).toULong)
    val data = duckdb_vector_get_data(column).asInstanceOf[Ptr[duckdb_string_t]]
    val validity = duckdb_vector_get_validity(column)
    if (duckdb_validity_row_is_valid(validity, _chunkIdx)) {
      val stringData = duckdb_string_t_data(data + _chunkIdx.toUSize)
      if (stringData == null) {
        _lastWasNull = true
        null
      } else {
        _lastWasNull = false
        fromCString(stringData)
      }
    } else {
      _lastWasNull = true
      null
    }
  }

  override def getShort(columnIndex: Int): Short = {
    getIntegerNumber(columnIndex).toShort
  }

  override def getInt(columnIndex: Int): Int = {
    getIntegerNumber(columnIndex).toInt
  }

  override def getLong(columnIndex: Int): Long = {
    getIntegerNumber(columnIndex)
  }

  private def getIntegerNumber(columnIndex: Int): Long = {
    checkClosed()
    checkColumnIndex(columnIndex)
    val column =
      duckdb_data_chunk_get_vector(!_currentChunk, (columnIndex - 1).toULong)
    val validity = duckdb_vector_get_validity(column)
    if (!duckdb_validity_row_is_valid(validity, _chunkIdx)) {
      _lastWasNull = true
      0L
    } else {
      _lastWasNull = false
      val data = duckdb_vector_get_data(column)
      duckdb_column_type(result, (columnIndex - 1).toULong) match {
        case DUCKDB_TYPE.DUCKDB_TYPE_TINYINT =>
          data.asInstanceOf[Ptr[Byte]](_chunkIdx.toUSize).toLong
        case DUCKDB_TYPE.DUCKDB_TYPE_SMALLINT =>
          data.asInstanceOf[Ptr[Short]](_chunkIdx.toUSize).toLong
        case DUCKDB_TYPE.DUCKDB_TYPE_INTEGER =>
          data.asInstanceOf[Ptr[Int]](_chunkIdx.toUSize).toLong
        case DUCKDB_TYPE.DUCKDB_TYPE_BIGINT =>
          data.asInstanceOf[Ptr[Long]](_chunkIdx.toUSize).toLong
        case DUCKDB_TYPE.DUCKDB_TYPE_UTINYINT =>
          data.asInstanceOf[Ptr[UByte]](_chunkIdx.toUSize).toLong
        case DUCKDB_TYPE.DUCKDB_TYPE_USMALLINT =>
          data.asInstanceOf[Ptr[UShort]](_chunkIdx.toUSize).toLong
        case DUCKDB_TYPE.DUCKDB_TYPE_UINTEGER =>
          data.asInstanceOf[Ptr[UInt]](_chunkIdx.toUSize).toLong
        case DUCKDB_TYPE.DUCKDB_TYPE_UBIGINT =>
          data.asInstanceOf[Ptr[ULong]](_chunkIdx.toUSize).toLong
        case _ => 0L
      }
    }
  }

  override def getDouble(columnIndex: Int): Double = {
    getFloatingNumber(columnIndex).toDouble
  }

  override def getFloat(columnIndex: Int): Float = {
    getFloatingNumber(columnIndex).toFloat
  }

  private def getFloatingNumber(columnIndex: Int): Double = {
    checkClosed()
    checkColumnIndex(columnIndex)
    val column =
      duckdb_data_chunk_get_vector(!_currentChunk, (columnIndex - 1).toULong)
    val validity = duckdb_vector_get_validity(column)
    if (!duckdb_validity_row_is_valid(validity, _chunkIdx)) {
      _lastWasNull = true
      0L
    } else {
      _lastWasNull = false
      val data = duckdb_vector_get_data(column)
      duckdb_column_type(result, (columnIndex - 1).toULong) match {
        case DUCKDB_TYPE.DUCKDB_TYPE_TINYINT =>
          data.asInstanceOf[Ptr[Byte]](_chunkIdx.toUSize).toDouble
        case DUCKDB_TYPE.DUCKDB_TYPE_SMALLINT =>
          data.asInstanceOf[Ptr[Short]](_chunkIdx.toUSize).toDouble
        case DUCKDB_TYPE.DUCKDB_TYPE_INTEGER =>
          data.asInstanceOf[Ptr[Int]](_chunkIdx.toUSize).toDouble
        case DUCKDB_TYPE.DUCKDB_TYPE_BIGINT =>
          data.asInstanceOf[Ptr[Long]](_chunkIdx.toUSize).toDouble
        case DUCKDB_TYPE.DUCKDB_TYPE_UTINYINT =>
          data.asInstanceOf[Ptr[UByte]](_chunkIdx.toUSize).toDouble
        case DUCKDB_TYPE.DUCKDB_TYPE_USMALLINT =>
          data.asInstanceOf[Ptr[UShort]](_chunkIdx.toUSize).toDouble
        case DUCKDB_TYPE.DUCKDB_TYPE_UINTEGER =>
          data.asInstanceOf[Ptr[UInt]](_chunkIdx.toUSize).toDouble
        case DUCKDB_TYPE.DUCKDB_TYPE_UBIGINT =>
          data.asInstanceOf[Ptr[ULong]](_chunkIdx.toUSize).toDouble
        case DUCKDB_TYPE.DUCKDB_TYPE_FLOAT =>
          data.asInstanceOf[Ptr[Float]](_chunkIdx.toUSize).toDouble
        case DUCKDB_TYPE.DUCKDB_TYPE_DOUBLE =>
          data.asInstanceOf[Ptr[Double]](_chunkIdx.toUSize).toDouble
        case _ => Double.NaN
      }
    }
  }

  override def getBoolean(columnIndex: Int): Boolean = {
    checkClosed()
    checkColumnIndex(columnIndex)
    val column =
      duckdb_data_chunk_get_vector(!_currentChunk, (columnIndex - 1).toULong)
    val data = duckdb_vector_get_data(column).asInstanceOf[Ptr[Boolean]]
    val validity = duckdb_vector_get_validity(column)
    if (duckdb_validity_row_is_valid(validity, _chunkIdx)) {
      _lastWasNull = false
      data(_chunkIdx.toUSize)
    } else {
      _lastWasNull = true
      false
    }
  }

  override def getBytes(columnIndex: Int): scala.Array[Byte] = {
    ???
  }

  override def wasNull(): Boolean = {
    checkClosed()
    _lastWasNull
  }

  private def getColumnCount(): Int = {
    checkClosed()
    duckdb_column_count(result).toInt
  }

  private def checkClosed(): Unit = {
    if (_closed) {
      throw SQLException("ResultSet is closed")
    }
  }

  private def checkColumnIndex(columnIndex: Int): Unit = {
    if (columnIndex < 1 || columnIndex > getColumnCount()) {
      throw SQLException(s"Invalid column index: $columnIndex")
    }
  }

  override def findColumn(columnLabel: String): Int = {
    checkClosed()
    var i = 0
    val count = getColumnCount()
    while (i < count) {
      if (fromCString(duckdb_column_name(result, i.toULong)) == columnLabel) {
        return i + 1
      }
      i += 1
    }
    throw SQLException(s"Column not found: $columnLabel")
  }
}
