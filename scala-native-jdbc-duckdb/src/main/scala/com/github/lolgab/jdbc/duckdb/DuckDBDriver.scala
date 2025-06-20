package com.github.lolgab.jdbc.duckdb

import java.sql.{Driver, DriverPropertyInfo, Connection, SQLException}
import scala.collection.mutable
import java.{util => ju}
import java.util.logging.Logger

class DuckDBDriver extends Driver {
  private val urlPrefix = "jdbc:duckdb:"

  override def getParentLogger(): Logger = ???

  override def getPropertyInfo(
      url: String,
      info: ju.Properties
  ): scala.Array[DriverPropertyInfo] = ???

  override def connect(url: String, info: ju.Properties): Connection = {
    if (!acceptsURL(url)) {
      throw SQLException(s"Invalid DuckDB URL: $url")
    }

    val filename = url.substring(urlPrefix.length)
    DuckDBConnection(filename)
  }

  override def acceptsURL(url: String): Boolean = {
    url != null && url.startsWith(urlPrefix)
  }

  override def getMajorVersion(): Int = 1

  override def getMinorVersion(): Int = 2

  override def jdbcCompliant(): Boolean =
    false // The implementation is incomplete
}
