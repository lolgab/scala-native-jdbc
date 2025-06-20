package java.sql

/** An object that represents a precompiled SQL statement. A SQL statement is
  * precompiled and stored in a PreparedStatement object. This object can then
  * be used to efficiently execute this statement multiple times.
  */
trait PreparedStatement extends Statement {

  /** Executes the SQL query in this PreparedStatement object and returns the
    * ResultSet object.
    */
  def executeQuery(): ResultSet

  /** Executes the SQL statement in this PreparedStatement object, which must be
    * an SQL INSERT, UPDATE or DELETE statement; or an SQL statement that
    * returns nothing.
    */
  def executeUpdate(): Int

  /** Sets the designated parameter to the given String value.
    */
  def setString(parameterIndex: Int, x: String): Unit

  /** Sets the designated parameter to the given Int value.
    */
  def setInt(parameterIndex: Int, x: Int): Unit

  /** Sets the designated parameter to the given Long value.
    */
  def setLong(parameterIndex: Int, x: Long): Unit

  /** Sets the designated parameter to the given Double value.
    */
  def setDouble(parameterIndex: Int, x: Double): Unit

  /** Sets the designated parameter to the given Float value.
    */
  def setFloat(parameterIndex: Int, x: Float): Unit

  /** Sets the designated parameter to the given Boolean value.
    */
  def setBoolean(parameterIndex: Int, x: Boolean): Unit

  /** Sets the designated parameter to SQL NULL.
    */
  def setNull(parameterIndex: Int, sqlType: Int): Unit

  /** Sets the designated parameter to the given byte array.
    */
  def setBytes(parameterIndex: Int, x: scala.Array[Byte]): Unit

  /** Clears the current parameter values immediately.
    */
  def clearParameters(): Unit
}
