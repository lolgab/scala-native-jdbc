package java.sql

/** An exception that provides information about a database access error or
  * other errors.
  */
class SQLException(
    message: String = null,
    sqlState: String = null,
    vendorCode: Int = 0,
    cause: Throwable = null
) extends Exception(message, cause) {

  private var _sqlState: String = sqlState
  private var _vendorCode: Int = vendorCode
  private var _nextException: SQLException = null

  def this(message: String) = this(message, null, 0, null)

  /** Retrieves the SQLState for this SQLException object.
    */
  def getSQLState(): String = _sqlState

  /** Retrieves the vendor-specific exception code for this SQLException object.
    */
  def getErrorCode(): Int = _vendorCode

  /** Retrieves the exception chained to this SQLException object.
    */
  def getNextException(): SQLException = _nextException

  /** Adds an SQLException to the end of the chain.
    */
  def setNextException(ex: SQLException): Unit = {
    var last = this
    while (last.getNextException() != null) {
      last = last.getNextException()
    }
    last._nextException = ex
  }

  /** Retrieves the exception that caused this SQLException.
    */
  override def getCause(): Throwable = super.getCause
}
