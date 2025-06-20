package java.sql

/** The interface that every driver class must implement.
  */
trait Driver {

  /** Attempts to make a database connection to the given URL.
    */
  def connect(url: String, info: java.util.Properties): Connection

  /** Retrieves whether the driver thinks that it can open a connection to the
    * given URL.
    */
  def acceptsURL(url: String): Boolean

  /** Retrieves information about the possible properties for this driver.
    */
  def getPropertyInfo(
      url: String,
      info: java.util.Properties
  ): scala.Array[DriverPropertyInfo]

  /** Gets information about the possible properties for this driver.
    */
  def getPropertyInfo(
      url: String,
      info: Map[String, String]
  ): scala.Array[DriverPropertyInfo]

  /** Retrieves the driver's major version number.
    */
  def getMajorVersion(): Int

  /** Retrieves the driver's minor version number.
    */
  def getMinorVersion(): Int

  /** Reports whether this driver is a genuine JDBC CompliantTM driver.
    */
  def jdbcCompliant(): Boolean
}

/** DriverPropertyInfo is used to provide information about the properties that
  * can be specified when connecting to a database.
  */
case class DriverPropertyInfo(
    name: String,
    value: String,
    description: String = "",
    required: Boolean = false,
    choices: scala.Array[String] = scala.Array.empty[String]
)
