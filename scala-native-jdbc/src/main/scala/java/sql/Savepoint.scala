package java.sql

/** The Savepoint interface contains methods for working with transaction
  * savepoints. A savepoint is a point within the current transaction that can
  * be referenced from the Connection.rollback method to undo all changes that
  * occurred after the savepoint.
  */
trait Savepoint {

  /** Retrieves the generated ID for the savepoint that this Savepoint object
    * represents.
    */
  def getSavepointId(): Int

  /** Retrieves the name of the savepoint that this Savepoint object represents.
    */
  def getSavepointName(): String
}
