package javax.sql

import java.sql.*
import java.io.PrintWriter
import java.util.logging.Logger

trait DataSource {
  def getConnection(): Connection

  def getParentLogger(): Logger

  def getConnection(username: String, password: String): Connection

  def getLogWriter(): PrintWriter

  def getLoginTimeout(): Int

  def setLoginTimeout(seconds: Int): Unit

  def setLogWriter(out: PrintWriter): Unit

  def unwrap[T](iface: Class[T]): T

  def isWrapperFor(iface: Class[?]): Boolean
}
