package java.sql

import scala.scalanative.unsafe.*
import scala.util.Try

/**
 * Represents a connection to a database. This is the main interface for interacting
 * with a database in the JDBC API.
 */
trait Connection extends AutoCloseable {
  /**
   * Creates a Statement object for sending SQL statements to the database.
   */
  def createStatement(): Statement

  /**
   * Creates a PreparedStatement object for sending parameterized SQL statements to the database.
   */
  def prepareStatement(sql: String): PreparedStatement

  /**
   * Sets this connection's auto-commit mode.
   */
  def setAutoCommit(autoCommit: Boolean): Unit

  /**
   * Retrieves the current auto-commit mode.
   */
  def getAutoCommit(): Boolean

  /**
   * Makes all changes made since the previous commit/rollback permanent.
   */
  def commit(): Unit

  /**
   * Undoes all changes made in the current transaction.
   */
  def rollback(): Unit

  /**
   * Releases this Connection object's database and JDBC resources immediately.
   */
  def close(): Unit

  /**
   * Retrieves whether this Connection object has been closed.
   */
  def isClosed(): Boolean

  /**
   * Creates a savepoint in the current transaction.
   */
  def setSavepoint(): Savepoint

  /**
   * Creates a savepoint with the given name in the current transaction.
   */
  def setSavepoint(name: String): Savepoint

  /**
   * Removes the specified Savepoint and subsequent Savepoint objects from the current transaction.
   */
  def releaseSavepoint(savepoint: Savepoint): Unit

  /**
   * Retrieves the current transaction isolation level.
   */
  def getTransactionIsolation(): Int

  /**
   * Attempts to change the transaction isolation level.
   */
  def setTransactionIsolation(level: Int): Unit
}

object Connection {
  // Transaction Isolation Levels
  final val TRANSACTION_NONE = 0
  final val TRANSACTION_READ_UNCOMMITTED = 1
  final val TRANSACTION_READ_COMMITTED = 2
  final val TRANSACTION_REPEATABLE_READ = 4
  final val TRANSACTION_SERIALIZABLE = 8
} 