# scala-native-jdbc

JDBC driver implementations for Scala Native

## Implementations

### SQLite

Add the following dependency to your build:
```scala
"com.github.lolgab" %%% "scala-native-jdbc-sqlite" % "0.0.3"
```

Then you can use a subset of the APIs that you available for `"org.xerial" % "sqlite-jdbc" % "3.43.0.0"`

### DuckDB

Add the following dependency to your build:
```scala
"com.github.lolgab" %%% "scala-native-jdbc-duckdb" % "0.0.3"
```

## Published libraries

Some Scala JDBC libraries were published under `com.github.lolgab` until
the official repositories start supporting Scala Native.

### [magnum](https://github.com/augustnagro/magnum)

Add the following dependency to your build:

```scala
"com.github.lolgab" %%% "magnum" % "1.3.1"
```

### [scalasql](https://github.com/com-lihaoyi/scalasql)

Add the following dependency to your build:

```scala
"com.github.lolgab" %%% "scalasql" % "0.1.20"
```
