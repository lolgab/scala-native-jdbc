package java.sql

import scala.collection.mutable
import scala.util.Try

import scala.jdk.CollectionConverters.*
import scala.util.control.NonFatal
import java.{util => ju}

/** The basic service for managing a set of JDBC drivers.
  */
object DriverManager {
  private val drivers = mutable.ArrayBuffer.from(
    ju.ServiceLoader.load(classOf[Driver]).iterator().asScala
  )

  /** Registers the given driver with the DriverManager.
    */
  def registerDriver(driver: Driver): Unit = {
    if (!drivers.contains(driver)) {
      drivers.append(driver)
    }
  }

  /** Removes the specified driver from the DriverManager's list of registered
    * drivers.
    */
  def deregisterDriver(driver: Driver): Unit = {
    drivers.filterInPlace(_ != driver)
  }

  /** Attempts to establish a connection to the given database URL.
    */
  def getConnection(url: String): Connection = {
    getConnection(url, null, null)
  }

  /** Attempts to establish a connection to the given database URL with the
    * given user and password.
    */
  def getConnection(url: String, user: String, password: String): Connection = {
    val properties = java.util.Properties()
    if (user != null) properties.setProperty("user", user)
    if (password != null) properties.setProperty("password", password)
    drivers.view
      .flatMap(driver =>
        try { Option(driver.connect(url, properties)) }
        catch { case NonFatal(_) => None }
      )
      .headOption
      .getOrElse(throw SQLException(s"No suitable driver found for $url"))
  }

  /** Retrieves an Enumeration of all of the currently loaded JDBC drivers.
    */
  def getDrivers(): ju.Enumeration[Driver] =
    drivers.iterator.asJavaEnumeration
}
