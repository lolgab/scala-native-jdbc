package com.github.lolgab.jdbc.sqlite

import java.sql.{Driver, DriverPropertyInfo, Connection, SQLException}
import scala.collection.mutable
import java.{util => ju}
import java.util.logging.Logger

class SQLiteDriver extends Driver {
  private val urlPrefix = "jdbc:sqlite:"

  override def getParentLogger(): Logger = ???

  override def getPropertyInfo(
      url: String,
      info: ju.Properties
  ): scala.Array[DriverPropertyInfo] = ???

  override def connect(url: String, info: ju.Properties): Connection = {
    if (!acceptsURL(url)) {
      throw SQLException(s"Invalid SQLite URL: $url")
    }

    val filename = url.substring(urlPrefix.length)
    SQLiteConnection(filename)
  }

  override def acceptsURL(url: String): Boolean = {
    url != null && url.startsWith(urlPrefix)
  }

  override def getMajorVersion(): Int = 3 // SQLite3

  override def getMinorVersion(): Int = 0

  override def jdbcCompliant(): Boolean =
    false // SQLite doesn't support all JDBC features
}
