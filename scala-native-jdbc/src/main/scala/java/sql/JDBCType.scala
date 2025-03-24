package java.sql

enum JDBCType(private val vendorTypeNumber: Int) extends Enum[JDBCType] {
  case ARRAY extends JDBCType(Types.ARRAY)
  case BIGINT extends JDBCType(Types.BIGINT) 
  case BINARY extends JDBCType(Types.BINARY)
  case BIT extends JDBCType(Types.BIT)
  case BLOB extends JDBCType(Types.BLOB)
  case BOOLEAN extends JDBCType(Types.BOOLEAN)
  case CHAR extends JDBCType(Types.CHAR)
  case CLOB extends JDBCType(Types.CLOB)
  case DATALINK extends JDBCType(Types.DATALINK)
  case DATE extends JDBCType(Types.DATE)
  case DECIMAL extends JDBCType(Types.DECIMAL)
  case DISTINCT extends JDBCType(Types.DISTINCT)
  case DOUBLE extends JDBCType(Types.DOUBLE)
  case FLOAT extends JDBCType(Types.FLOAT)
  case INTEGER extends JDBCType(Types.INTEGER)
  case JAVA_OBJECT extends JDBCType(Types.JAVA_OBJECT)
  case LONGNVARCHAR extends JDBCType(Types.LONGNVARCHAR)
  case LONGVARBINARY extends JDBCType(Types.LONGVARBINARY)
  case LONGVARCHAR extends JDBCType(Types.LONGVARCHAR)
  case NCHAR extends JDBCType(Types.NCHAR)
  case NCLOB extends JDBCType(Types.NCLOB)
  case NULL extends JDBCType(Types.NULL)
  case NUMERIC extends JDBCType(Types.NUMERIC)
  case NVARCHAR extends JDBCType(Types.NVARCHAR)
  case OTHER extends JDBCType(Types.OTHER)
  case REAL extends JDBCType(Types.REAL)
  case REF extends JDBCType(Types.REF)
  case REF_CURSOR extends JDBCType(Types.REF_CURSOR)
  case ROWID extends JDBCType(Types.ROWID)
  case SMALLINT extends JDBCType(Types.SMALLINT)
  case SQLXML extends JDBCType(Types.SQLXML)
  case STRUCT extends JDBCType(Types.STRUCT)
  case TIME extends JDBCType(Types.TIME)
  case TIME_WITH_TIMEZONE extends JDBCType(Types.TIME_WITH_TIMEZONE)
  case TIMESTAMP extends JDBCType(Types.TIMESTAMP)
  case TIMESTAMP_WITH_TIMEZONE extends JDBCType(Types.TIMESTAMP_WITH_TIMEZONE)
  case TINYINT extends JDBCType(Types.TINYINT)
  case VARBINARY extends JDBCType(Types.VARBINARY)
  case VARCHAR extends JDBCType(Types.VARCHAR)

  def getVendorTypeNumber(): Integer = vendorTypeNumber
  def getName(): String = name()
}
object JDBCType {
  def fromVendorTypeNumber(vendorTypeNumber: Int): JDBCType = {
    values.find(_.vendorTypeNumber == vendorTypeNumber).get
  }
}
