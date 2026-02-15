ThisBuild / scalaVersion := "3.3.4"
// ThisBuild / versionScheme := Some("early-semver")

ThisBuild / organization := "com.github.lolgab"
ThisBuild / homepage := Some(url("https://github.com/lolgab/scala-native-jdbc"))
ThisBuild / licenses := List(
  "Apache-2.0" -> url("http://www.apache.org/licenses/LICENSE-2.0")
)
ThisBuild / developers := List(
  Developer(
    "lolgab",
    "Lorenzo Gabriele",
    "lorenzolespaul@gmail.com",
    url("https://github.com/lolgab")
  )
)

lazy val `scala-native-jdbc` = project
  .in(file("scala-native-jdbc"))
  .settings(
    name := "scala-native-jdbc",
    Compile / packageBin / mappings ~= {
      _.filter { case (_, path) =>
        !path.endsWith(".class") || !path.endsWith(".tasty")
      }
    }
  )
  .enablePlugins(ScalaNativePlugin)

lazy val `scala-native-jdbc-sqlite` = project
  .in(file("scala-native-jdbc-sqlite"))
  .settings(
    name := "scala-native-jdbc-sqlite",
    Compile / resourceGenerators += Def.task {
      val url = "https://sqlite.org/2026/sqlite-amalgamation-3510200.zip"
      val targetDir =
        (Compile / resourceManaged).value / "scala-native" / "sqlite"
      val tempDir = IO.createTemporaryDirectory

      try {
        // Download and extract to temp directory
        val tempZip = tempDir / "sqlite.zip"
        sbt.io.Using.urlInputStream(new URL(url)) { inputStream =>
          IO.transfer(inputStream, tempZip)
        }
        IO.unzip(tempZip, tempDir)

        // Create target directory and copy only sqlite3.c
        targetDir.mkdirs()
        val sqlite3File =
          tempDir / "sqlite-amalgamation-3510200" / "sqlite3.c"
        IO.copyFile(sqlite3File, targetDir / "sqlite3.c")
        Seq(targetDir / "sqlite3.c")
      } finally {
        // Cleanup
        IO.delete(tempDir)
      }
    }.taskValue,
    Test / test := {}
  )
  .enablePlugins(ScalaNativePlugin)
  .dependsOn(`scala-native-jdbc`)

lazy val `scala-native-jdbc-duckdb` = project
  .in(file("scala-native-jdbc-duckdb"))
  .settings(
    name := "scala-native-jdbc-duckdb",
    Compile / resourceGenerators += Def.task {
      val url =
        "https://raw.githubusercontent.com/duckdb/duckdb/refs/tags/v1.2.1/src/include/duckdb.h"
      val targetDir =
        (Compile / resourceManaged).value / "scala-native" / "duckdb"
      val tempDir = IO.createTemporaryDirectory

      // Create target directory
      targetDir.mkdirs()

      // Download  to temp directory
      val tempHeader = tempDir / "duckdb.h"
      sbt.io.Using.urlInputStream(new URL(url)) { inputStream =>
        IO.transfer(inputStream, targetDir / "duckdb.h")
      }
      Seq(targetDir / "duckdb.h")
    }.taskValue,
    Test / test := {}
  )
  .enablePlugins(ScalaNativePlugin)
  .dependsOn(`scala-native-jdbc`)

lazy val `scala-native-jdbc-sqlite-tests` =
  crossProject(JVMPlatform, NativePlatform)
    .crossType(CrossType.Pure)
    .in(file("scala-native-jdbc-sqlite-tests"))
    .settings(
      name := "scala-native-jdbc-sqlite-tests",
      noPublishSettings,
      libraryDependencies ++= Seq(
        "org.scalameta" %%% "munit" % "1.0.0" % Test
      )
    )
    .nativeSettings(
      nativeConfig ~= { c =>
        c.withServiceProviders(
          Map(
            "java.sql.Driver" -> Seq(
              "com.github.lolgab.jdbc.sqlite.SQLiteDriver"
            )
          )
        )
      }
    )
    .nativeConfigure(
      _.dependsOn(`scala-native-jdbc-sqlite`)
    )
    .jvmSettings(
      Test / fork := true,
      libraryDependencies ++= Seq(
        "org.xerial" % "sqlite-jdbc" % "3.51.2.0"
      )
    )

lazy val `scala-native-jdbc-duckdb-tests` = crossProject(
  JVMPlatform,
  NativePlatform
)
  .crossType(CrossType.Pure)
  .in(file("scala-native-jdbc-duckdb-tests"))
  .settings(
    name := "scala-native-jdbc-duckdb-tests",
    noPublishSettings,
    libraryDependencies ++= Seq(
      "org.scalameta" %%% "munit" % "1.0.0" % Test
    )
  )
  .nativeSettings(
    nativeConfig ~= { c =>
      // Assumes libduckdb.dylib is in /usr/local/lib on Mac OS
      c.withLinkingOptions(c.linkingOptions ++ Seq("-rpath", "/usr/local/lib"))
        .withServiceProviders(
          Map(
            "java.sql.Driver" -> Seq(
              "com.github.lolgab.jdbc.duckdb.DuckDBDriver"
            )
          )
        )
    }
  )
  .nativeConfigure(
    _.dependsOn(`scala-native-jdbc-duckdb`)
  )
  .jvmSettings(
    Test / fork := true,
    libraryDependencies ++= Seq(
      "org.duckdb" % "duckdb_jdbc" % "1.2.1"
    )
  )

lazy val `scalasql-tests` = project
  .in(file("scalasql-tests"))
  .settings(
    name := "scalasql-tests",
    scalaVersion := "3.6.2",
    libraryDependencies ++= Seq(
      "com.lihaoyi" %%% "geny" % "1.1.1",
      "com.lihaoyi" %%% "pprint" % "0.9.0",
      "com.lihaoyi" %%% "upickle" % "3.3.1" % Test,
      "com.lihaoyi" %%% "os-lib" % "0.10.7" % Test,
      "com.lihaoyi" %%% "utest" % "0.8.5" % Test,
      "io.github.cquiroz" %%% "scala-java-time" % "2.6.0" % Test
    ),
    testFrameworks += new TestFramework("utest.runner.Framework"),
    publish / skip := true
  )
  .settings(
    nativeConfig ~= {
      _.withServiceProviders(
        Map(
          "java.sql.Driver" -> Seq("com.github.lolgab.jdbc.sqlite.SQLiteDriver")
        )
      )
        .withSourceLevelDebuggingConfig(_.enableAll)
        .withOptimize(false)
    },
    Test / mainClass := Some("scalasql.example.SqliteExample")
  )
  .enablePlugins(ScalaNativePlugin)
  .dependsOn(`scala-native-jdbc-sqlite`)

lazy val root = project
  .in(file("."))
  .settings(
    name := "root",
    noPublishSettings
  )
  .aggregate(
    `scala-native-jdbc`,
    `scala-native-jdbc-sqlite`,
    `scala-native-jdbc-duckdb`,
    `scala-native-jdbc-sqlite-tests`.jvm,
    `scala-native-jdbc-sqlite-tests`.native,
    `scala-native-jdbc-duckdb-tests`.jvm,
    `scala-native-jdbc-duckdb-tests`.native
  )

lazy val noPublishSettings = Seq(
  publish / skip := true
)
