package tests

import java.sql.*

class SimpleTest extends munit.FunSuite {
  test("simple test") {
    val connection = DriverManager.getConnection("jdbc:duckdb:")
    val statement = connection.createStatement()
    statement.executeUpdate(
      "CREATE TABLE test (id INTEGER PRIMARY KEY, name TEXT)"
    )
    statement.executeUpdate("INSERT INTO test (id, name) VALUES (1, 'John')")
    statement.executeUpdate("INSERT INTO test (id, name) VALUES (2, 'Jane')")
    statement.executeUpdate("INSERT INTO test (id, name) VALUES (3, 'Jim')")
    val resultSet = statement.executeQuery("SELECT * FROM test")
    resultSet.next()
    assertEquals(resultSet.getString("name"), "John")
    resultSet.next()
    assertEquals(resultSet.getString("name"), "Jane")
    resultSet.next()
    assertEquals(resultSet.getString("name"), "Jim")
  }

  test("executeUpdate returns the number of rows affected") {
    val connection = DriverManager.getConnection("jdbc:duckdb:")
    val statement = connection.createStatement()
    statement.executeUpdate(
      "CREATE TABLE test (id INTEGER PRIMARY KEY, name TEXT)"
    )
    assertEquals(
      statement.executeUpdate(
        "INSERT INTO test (id, name) VALUES (1, 'John'), (3, 'Jim'), (4, 'Sarah')"
      ),
      3
    )
    assertEquals(statement.executeUpdate("DELETE FROM test;"), 3)
  }

  test("PreparedStatement.executeUpdate returns the number of rows affected") {
    val connection = DriverManager.getConnection("jdbc:duckdb:")
    val statement = connection.createStatement()
    statement.executeUpdate(
      "CREATE TABLE test (id INTEGER PRIMARY KEY, name TEXT)"
    )
    assertEquals(
      connection
        .prepareStatement(
          "INSERT INTO test (id, name) VALUES (1, 'John'), (3, 'Jim'), (4, 'Sarah')"
        )
        .executeUpdate(),
      3
    )
    assertEquals(
      connection.prepareStatement("DELETE FROM test;").executeUpdate(),
      3
    )
  }

  test("complex test with multiple tables and joins") {
    val connection = DriverManager.getConnection("jdbc:duckdb:")
    val statement = connection.createStatement()

    // Create tables
    statement.executeUpdate("""
      CREATE TABLE customers (
        id INTEGER PRIMARY KEY,
        name TEXT,
        email TEXT,
        created_at TIMESTAMP
      )
    """)

    statement.executeUpdate("""
      CREATE TABLE orders (
        id INTEGER PRIMARY KEY,
        customer_id INTEGER,
        total DOUBLE,
        order_date TIMESTAMP,
        FOREIGN KEY(customer_id) REFERENCES customers(id)
      )
    """)

    statement.executeUpdate("""
      CREATE TABLE order_items (
        id INTEGER PRIMARY KEY,
        order_id INTEGER,
        product TEXT,
        quantity INTEGER,
        price DECIMAL(10,2),
        FOREIGN KEY(order_id) REFERENCES orders(id)
      )
    """)

    // Insert test data
    statement.executeUpdate("""
      INSERT INTO customers (id, name, email, created_at) VALUES
      (1, 'John Doe', 'john@example.com', '2023-01-01 10:00:00'),
      (2, 'Jane Smith', 'jane@example.com', '2023-01-02 11:00:00')
    """)

    statement.executeUpdate("""
      INSERT INTO orders (id, customer_id, total, order_date) VALUES
      (1, 1, 100.50, '2023-02-01 09:00:00'),
      (2, 1, 75.25, '2023-02-15 14:00:00'),
      (3, 2, 200.00, '2023-02-10 16:00:00')
    """)

    statement.executeUpdate("""
      INSERT INTO order_items (id, order_id, product, quantity, price) VALUES
      (1, 1, 'Widget', 2, 25.25),
      (2, 1, 'Gadget', 1, 50.00),
      (3, 2, 'Widget', 1, 25.25),
      (4, 2, 'Gizmo', 2, 25.00),
      (5, 3, 'Gadget', 4, 50.00)
    """)

    // Test complex query with joins and aggregations
    val resultSet = statement.executeQuery("""
      SELECT 
        c.name,
        COUNT(DISTINCT o.id) as order_count,
        SUM(o.total) as total_spent,
        GROUP_CONCAT(DISTINCT oi.product) as products
      FROM customers c
      LEFT JOIN orders o ON c.id = o.customer_id
      LEFT JOIN order_items oi ON o.id = oi.order_id
      GROUP BY c.id, c.name
      ORDER BY total_spent DESC
    """)

    // Verify first row (John)
    resultSet.next()
    assertEquals(resultSet.getString("name"), "John Doe")
    assertEquals(resultSet.getInt("order_count"), 2)
    assertEquals(resultSet.getDouble("total_spent"), 351.5)
    assert(resultSet.getString("products").contains("Widget"))
    assert(resultSet.getString("products").contains("Gadget"))
    assert(resultSet.getString("products").contains("Gizmo"))

    // Verify second row (Jane)
    resultSet.next()
    assertEquals(resultSet.getString("name"), "Jane Smith")
    assertEquals(resultSet.getInt("order_count"), 1)
    assertEquals(resultSet.getDouble("total_spent"), 200.00)
    assertEquals(resultSet.getString("products"), "Gadget")
  }

  test("prepareStatement query returns all results") {
    val connection = DriverManager.getConnection("jdbc:duckdb:")
    connection
      .createStatement()
      .executeUpdate(
        """CREATE TABLE p (name TEXT, price INTEGER);"""
      )
    connection
      .createStatement()
      .executeUpdate(
        """INSERT INTO p (name, price) VALUES ('a', 1), ('b', 2);"""
      )
    val rs = connection.prepareStatement("SELECT * FROM p;").executeQuery()

    val builder = Seq.newBuilder[(String, Int)]
    while (rs.next()) {
      builder += (rs.getString(1) -> rs.getInt(2))
    }
    assertEquals(builder.result(), Seq(("a", 1), ("b", 2)))
  }
}
