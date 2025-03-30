package com.github.lolgab.jdbc

import java.sql.ResultSet

/** Helper trait for result sets, with some default implementations */
trait SimpleResultSet extends ResultSet {
  // Column value getters by column name
  override def getString(columnLabel: String): String = {
    getString(findColumn(columnLabel))
  }
  override def getShort(columnLabel: String): Short = {
    getShort(findColumn(columnLabel))
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

}
