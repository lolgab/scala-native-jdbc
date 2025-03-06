package scalasql.utils

import scalasql.DbApi
import scalasql.dialects._
import utest.TestSuite

abstract class ScalaSqlSuite(implicit val suiteLine: sourcecode.Line)
    extends TestSuite
    with Dialect {
  def checker: TestChecker
  lazy val db: DbApi = dbClient.getAutoCommitClientConnection

  lazy val dbClient = checker.dbClient
  def description: String
}

trait SqliteSuite extends ScalaSqlSuite with SqliteDialect {
  val checker = new TestChecker(
    scalasql.example.SqliteExample.sqliteClient,
    "sqlite-customer-schema.sql",
    "customer-data.sql",
    getClass.getName,
    suiteLine.value,
    description
  )

  checker.reset()
}
