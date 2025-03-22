package org.duckdb

import java.sql.*
import java.io.PrintWriter
import java.util.logging.Logger

class DuckDBSource extends javax.sql.DataSource {

  private val driver = com.github.lolgab.jdbc.duckdb.DuckDBDriver()
  private var url: String = ""

  def setUrl(url: String): Unit = this.url = url

  def getUrl(): String = url

  def getConnection(): Connection = {
    driver.connect(url, java.util.Properties())
  }

  override def getParentLogger(): Logger = ???

  override def getConnection(username: String, password: String): Connection =
    ???

  override def getLogWriter(): PrintWriter = ???

  override def getLoginTimeout(): Int = ???

  override def setLoginTimeout(seconds: Int): Unit = ???

  override def setLogWriter(out: PrintWriter): Unit = ???

  override def unwrap[T](iface: Class[T]): T = ???

  override def isWrapperFor(iface: Class[?]): Boolean = ???
}
