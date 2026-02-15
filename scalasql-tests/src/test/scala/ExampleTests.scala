package scalasql
import utest._

/**
 * Make sure the examples all have passing main methods
 */
object ExampleTests extends TestSuite {
  def tests = Tests {
    test("sqlite") - example.SqliteExample.main(Array())
  }
}
