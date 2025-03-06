package com.github.lolgab.jdbc.sqlite

import java.sql.*
import com.github.lolgab.jdbc.sqlite.internal.SQLiteOps
import com.github.lolgab.jdbc.sqlite.internal.constants.*
import com.github.lolgab.jdbc.sqlite.internal.structs.*
import com.github.lolgab.jdbc.sqlite.internal.functions.*
import scala.scalanative.unsafe.*
import java.io.InputStream
import java.{util => ju}
import java.io.Reader
import java.net.URL

class SQLiteResultSet(statement: SQLiteStatement, stmt: Ptr[sqlite3_stmt]) extends ResultSet {

  override def deleteRow(): Unit = ???

  override def getShort(columnIndex: Int): Short = ???

  override def getShort(columnLabel: String): Short = ???

  override def updateInt(columnIndex: Int, x: Int): Unit = ???

  override def updateInt(columnLabel: String, x: Int): Unit = ???

  override def updateShort(columnIndex: Int, x: Short): Unit = ???

  override def updateShort(columnLabel: String, x: Short): Unit = ???

  override def updateFloat(columnIndex: Int, x: Float): Unit = ???

  override def updateFloat(columnLabel: String, x: Float): Unit = ???

  override def getAsciiStream(columnIndex: Int): InputStream = ???

  override def getAsciiStream(columnLabel: String): InputStream = ???

  override def updateBytes(columnIndex: Int, x: scala.Array[Byte]): Unit = ???

  override def updateBytes(columnLabel: String, x: scala.Array[Byte]): Unit = ???

  override def updateAsciiStream(columnIndex: Int, x: InputStream, length: Int): Unit = ???

  override def updateAsciiStream(columnLabel: String, x: InputStream, length: Int): Unit = ???

  override def updateAsciiStream(columnIndex: Int, x: InputStream, length: Long): Unit = ???

  override def updateAsciiStream(columnLabel: String, x: InputStream, length: Long): Unit = ???

  override def updateAsciiStream(columnIndex: Int, x: InputStream): Unit = ???

  override def updateAsciiStream(columnLabel: String, x: InputStream): Unit = ???

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

  override def updateBlob(columnIndex: Int, inputStream: InputStream, length: Long): Unit = ???

  override def updateBlob(columnLabel: String, inputStream: InputStream, length: Long): Unit = ???

  override def updateBlob(columnIndex: Int, inputStream: InputStream): Unit = ???

  override def updateBlob(columnLabel: String, inputStream: InputStream): Unit = ???

  override def updateNCharacterStream(columnIndex: Int, x: Reader, length: Long): Unit = ???

  override def updateNCharacterStream(columnLabel: String, reader: Reader, length: Long): Unit = ???

  override def updateNCharacterStream(columnIndex: Int, x: Reader): Unit = ???

  override def updateNCharacterStream(columnLabel: String, reader: Reader): Unit = ???

  override def getNCharacterStream(columnIndex: Int): Reader = ???

  override def getNCharacterStream(columnLabel: String): Reader = ???

  override def setFetchDirection(direction: Int): Unit = ???

  override def updateNString(columnIndex: Int, nString: String): Unit = ???

  override def updateNString(columnLabel: String, nString: String): Unit = ???

  override def updateBigDecimal(columnIndex: Int, x: java.math.BigDecimal): Unit = ???

  override def updateBigDecimal(columnLabel: String, x: java.math.BigDecimal): Unit = ???

  override def getObject(columnIndex: Int): Object = ???

  override def getObject(columnLabel: String): Object = ???

  override def getObject(columnIndex: Int, map: ju.Map[String, Class[?]]): Object = ???

  override def getObject(columnLabel: String, map: ju.Map[String, Class[?]]): Object = ???

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

  override def updateClob(columnIndex: Int, reader: Reader, length: Long): Unit = ???

  override def updateClob(columnLabel: String, reader: Reader, length: Long): Unit = ???

  override def updateClob(columnIndex: Int, reader: Reader): Unit = ???

  override def updateClob(columnLabel: String, reader: Reader): Unit = ???

  override def beforeFirst(): Unit = ???

  override def updateBinaryStream(columnIndex: Int, x: InputStream, length: Int): Unit = ???

  override def updateBinaryStream(columnLabel: String, x: InputStream, length: Int): Unit = ???

  override def updateBinaryStream(columnIndex: Int, x: InputStream, length: Long): Unit = ???

  override def updateBinaryStream(columnLabel: String, x: InputStream, length: Long): Unit = ???

  override def updateBinaryStream(columnIndex: Int, x: InputStream): Unit = ???

  override def updateBinaryStream(columnLabel: String, x: InputStream): Unit = ???

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

  override def updateObject(columnIndex: Int, x: Object, scaleOrLength: Int): Unit = ???

  override def updateObject(columnIndex: Int, x: Object): Unit = ???

  override def updateObject(columnLabel: String, x: Object, scaleOrLength: Int): Unit = ???

  override def updateObject(columnLabel: String, x: Object): Unit = ???

  override def getWarnings(): SQLWarning = ???

  override def setFetchSize(rows: Int): Unit = ???

  override def updateBoolean(columnIndex: Int, x: Boolean): Unit = ???

  override def updateBoolean(columnLabel: String, x: Boolean): Unit = ???

  override def updateCharacterStream(columnIndex: Int, x: Reader, length: Int): Unit = ???

  override def updateCharacterStream(columnLabel: String, reader: Reader, length: Int): Unit = ???

  override def updateCharacterStream(columnIndex: Int, x: Reader, length: Long): Unit = ???

  override def updateCharacterStream(columnLabel: String, reader: Reader, length: Long): Unit = ???

  override def updateCharacterStream(columnIndex: Int, x: Reader): Unit = ???

  override def updateCharacterStream(columnLabel: String, reader: Reader): Unit = ???

  override def getType(): Int = ???

  override def getURL(columnIndex: Int): URL = ???

  override def getURL(columnLabel: String): URL = ???

  override def getBinaryStream(columnIndex: Int): InputStream = ???

  override def getBinaryStream(columnLabel: String): InputStream = ???

  override def updateNClob(columnIndex: Int, nClob: NClob): Unit = ???

  override def updateNClob(columnLabel: String, nClob: NClob): Unit = ???

  override def updateNClob(columnIndex: Int, reader: Reader, length: Long): Unit = ???

  override def updateNClob(columnLabel: String, reader: Reader, length: Long): Unit = ???

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

  override def getTimestamp(columnLabel: String, cal: ju.Calendar): Timestamp = ???

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

  override def getBigDecimal(columnIndex: Int, scale: Int): java.math.BigDecimal = ???

  override def getBigDecimal(columnLabel: String, scale: Int): java.math.BigDecimal = ???

  override def getBigDecimal(columnIndex: Int): java.math.BigDecimal = ???

  override def getBigDecimal(columnLabel: String): java.math.BigDecimal = ???

  override def getUnicodeStream(columnIndex: Int): InputStream = ???

  override def getUnicodeStream(columnLabel: String): InputStream = ???

  override def refreshRow(): Unit = ???

  override def unwrap[T](iface: Class[T]): T = ???

  override def isWrapperFor(iface: Class[?]): Boolean = ???

  private var _closed = false
  private var _lastWasNull = false
  private var _row = 0
  private var _isBeforeFirst = true
  private var _isAfterLast = false

  override def next(): Boolean = {
    checkClosed()
    if (isAfterLast) return false

    val result = sqlite3_step(stmt)
    result match {
      case SQLITE_ROW =>
        _isBeforeFirst = false
        _row += 1
        true
      case SQLITE_DONE =>
        _isBeforeFirst = false
        _isAfterLast = true
        false
      case _ =>
        throw SQLException("Error while moving to next row")
    }
  }

  override def close(): Unit = {
    if (!_closed) {
      println(s"finalizing statement $stmt")
      sqlite3_finalize(stmt)
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
    _row == 1 && !_isBeforeFirst && !_isAfterLast
  }

  override def isLast(): Boolean = {
    checkClosed()
    !_isBeforeFirst && !_isAfterLast && sqlite3_step(stmt) == SQLITE_DONE
  }

  override def getRow(): Int = {
    checkClosed()
    if (_isBeforeFirst || _isAfterLast) 0 else _row
  }

  override def getString(columnIndex: Int): String = {
    checkClosed()
    checkColumnIndex(columnIndex)
    val result = SQLiteOps.getString(stmt, columnIndex - 1)
    _lastWasNull = result == null
    result
  }

  override def getInt(columnIndex: Int): Int = {
    checkClosed()
    checkColumnIndex(columnIndex)
    val result = SQLiteOps.getInt(stmt, columnIndex - 1)
    _lastWasNull = sqlite3_column_type(stmt, columnIndex - 1) == SQLITE_NULL
    result
  }

  override def getLong(columnIndex: Int): Long = {
    checkClosed()
    checkColumnIndex(columnIndex)
    val result = SQLiteOps.getLong(stmt, columnIndex - 1)
    _lastWasNull = sqlite3_column_type(stmt, columnIndex - 1) == SQLITE_NULL
    result
  }

  override def getDouble(columnIndex: Int): Double = {
    checkClosed()
    checkColumnIndex(columnIndex)
    val result = SQLiteOps.getDouble(stmt, columnIndex - 1)
    _lastWasNull = sqlite3_column_type(stmt, columnIndex - 1) == SQLITE_NULL
    result
  }

  override def getFloat(columnIndex: Int): Float = {
    getDouble(columnIndex).toFloat
  }

  override def getBoolean(columnIndex: Int): Boolean = {
    getInt(columnIndex) != 0
  }

  override def getBytes(columnIndex: Int): scala.Array[Byte] = {
    checkClosed()
    checkColumnIndex(columnIndex)
    val result = SQLiteOps.getBytes(stmt, columnIndex - 1)
    _lastWasNull = result == null
    result
  }

  override def wasNull(): Boolean = {
    checkClosed()
    _lastWasNull
  }

  override def getString(columnLabel: String): String = {
    getString(findColumn(columnLabel))
  }

  override def getInt(columnLabel: String): Int = {
    getInt(findColumn(columnLabel))
  }

  override def getLong(columnLabel: String): Long = {
    getLong(findColumn(columnLabel))
  }

  override def getDouble(columnLabel: String): Double = {
    getDouble(findColumn(columnLabel))
  }

  override def getFloat(columnLabel: String): Float = {
    getFloat(findColumn(columnLabel))
  }

  override def getBoolean(columnLabel: String): Boolean = {
    getBoolean(findColumn(columnLabel))
  }

  override def getBytes(columnLabel: String): scala.Array[Byte] = {
    getBytes(findColumn(columnLabel))
  }

  private def getColumnCount(): Int = {
    checkClosed()
    sqlite3_column_count(stmt)
  }

  private def getColumnName(column: Int): String = {
    checkClosed()
    checkColumnIndex(column)
    fromCString(sqlite3_column_name(stmt, column - 1))
  }

  private def getColumnType(column: Int): Int = {
    checkClosed()
    checkColumnIndex(column)
    sqlite3_column_type(stmt, column - 1)
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
      if (fromCString(sqlite3_column_name(stmt, i)) == columnLabel) {
        return i + 1
      }
      i += 1
    }
    throw SQLException(s"Column not found: $columnLabel")
  }
} 