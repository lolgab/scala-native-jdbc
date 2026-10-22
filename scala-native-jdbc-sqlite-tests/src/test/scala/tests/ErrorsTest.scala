package tests

import java.sql.*

/** Failures must reach the caller as SQLException, not read as success. */
class ErrorsTest extends munit.FunSuite {

  private def connection(): Connection = {
    val c = DriverManager.getConnection("jdbc:sqlite::memory:")
    c.createStatement()
      .executeUpdate(
        "CREATE TABLE test (id INTEGER PRIMARY KEY, name TEXT NOT NULL UNIQUE)"
      )
    c
  }

  test("Statement.executeUpdate with invalid SQL throws") {
    val c = connection()
    intercept[SQLException](
      c.createStatement().executeUpdate("INSERT INTO nowhere VALUES (1)")
    )
  }

  test("Statement.executeUpdate violating a constraint throws") {
    val c = connection()
    val s = c.createStatement()
    s.executeUpdate("INSERT INTO test (name) VALUES ('John')")
    intercept[SQLException](
      s.executeUpdate("INSERT INTO test (name) VALUES ('John')")
    )
  }

  test("prepareStatement with invalid SQL throws") {
    val c = connection()
    intercept[SQLException](c.prepareStatement("SELEC nothing"))
  }

  test("binding a parameter index that does not exist throws") {
    val c = connection()
    val p = c.prepareStatement("INSERT INTO test (name) VALUES (?)")
    // xerial, the reference, throws ArrayIndexOutOfBoundsException here; any exception will do.
    intercept[Exception](p.setString(2, "no such parameter"))
  }
}
