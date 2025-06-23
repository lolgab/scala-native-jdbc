package scalasql
import scalasql.api.{TransactionTests, DbApiTests}
import operations.{
  ExprBooleanOpsTests,
  ExprNumericOpsTests,
  ExprAggNumericOpsTests,
  ExprAggOpsTests,
  ExprOpsTests,
  DbApiOpsTests,
  ExprStringOpsTests,
  ExprBlobOpsTests,
  ExprMathOpsTests
}
import query.{
  InsertTests,
  DeleteTests,
  SelectTests,
  JoinTests,
  FlatJoinTests,
  CompoundSelectTests,
  SubQueryTests,
  UpdateTests,
  UpdateJoinTests,
  UpdateSubQueryTests,
  ReturningTests,
  OnConflictTests,
  ValuesTests,
  LateralJoinTests,
  WindowFunctionTests,
  GetGeneratedKeysTests,
  WithCteTests,
  SchemaTests
}
import scalasql.dialects.{
  SqliteDialectTests
}

package sqlite {

  import utils.SqliteSuite

  object DbApiTests extends DbApiTests with SqliteSuite
  object TransactionTests extends TransactionTests with SqliteSuite

  object SelectTests extends SelectTests with SqliteSuite
  object JoinTests extends JoinTests with SqliteSuite
  object FlatJoinTests extends FlatJoinTests with SqliteSuite
  object InsertTests extends InsertTests with SqliteSuite
  object UpdateTests extends UpdateTests with SqliteSuite
  object DeleteTests extends DeleteTests with SqliteSuite
  object CompoundSelectTests extends CompoundSelectTests with SqliteSuite
  object UpdateJoinTests extends UpdateJoinTests with SqliteSuite
  object UpdateSubQueryTests extends UpdateSubQueryTests with SqliteSuite
  object ReturningTests extends ReturningTests with SqliteSuite
  object OnConflictTests extends OnConflictTests with SqliteSuite
  object ValuesTests extends ValuesTests with SqliteSuite
  // Sqlite does not support lateral joins
  // object LateralJoinTests extends LateralJoinTests with SqliteSuite
  object WindowFunctionTests extends WindowFunctionTests with SqliteSuite
  // Sqlite does not support getGeneratedKeys https://github.com/xerial/sqlite-jdbc/issues/980
  // object GetGeneratedKeysTests extends GetGeneratedKeysTests with SqliteSuite

  object SubQueryTests extends SubQueryTests with SqliteSuite
  object WithCteTests extends WithCteTests with SqliteSuite

  object DbApiOpsTests extends DbApiOpsTests with SqliteSuite
  object ExprOpsTests extends ExprOpsTests with SqliteSuite
  object ExprBooleanOpsTests extends ExprBooleanOpsTests with SqliteSuite
  object ExprNumericOpsTests extends ExprNumericOpsTests with SqliteSuite
  object ExprSeqNumericOpsTests extends ExprAggNumericOpsTests with SqliteSuite
  object ExprSeqOpsTests extends ExprAggOpsTests with SqliteSuite
  object ExprStringOpsTests extends ExprStringOpsTests with SqliteSuite
  object ExprBlobOpsTests extends ExprBlobOpsTests with SqliteSuite
  // Sqlite doesn't support all these math operations
  // object ExprMathOpsTests extends ExprMathOpsTests with SqliteSuite
  // Sqlite doesn't support schemas
  // object SchemaTests extends SchemaTests with SqliteSuite

  object DataTypesTests extends datatypes.DataTypesTests with SqliteSuite
  object OptionalTests extends datatypes.OptionalTests with SqliteSuite

  object SqliteDialectTests extends SqliteDialectTests
}
