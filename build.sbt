val scalaV = "3.3.8"
val scalaVersions = Seq(scalaV)

// ThisBuild / versionScheme := Some("early-semver")
scalaVersion := scalaV

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
    libraryDependencies += "com.github.lolgab" % "scala-native-sqlite-amalgamation" % "3.53.2",
    Test / test := TestResult.Empty
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
    Test / test := TestResult.Empty
  )
  .enablePlugins(ScalaNativePlugin)
  .dependsOn(`scala-native-jdbc`)

lazy val `scala-native-jdbc-sqlite-tests` =
  projectMatrix
    .in(file("scala-native-jdbc-sqlite-tests"))
    .settings(
      name := "scala-native-jdbc-sqlite-tests",
      noPublishSettings,
      libraryDependencies ++= Seq(
        "org.scalameta" %% "munit" % "1.3.3" % Test
      )
    )
    .jvmPlatform(
      scalaVersions = scalaVersions,
      settings = Seq(
        Test / fork := true,
        libraryDependencies += "org.xerial" % "sqlite-jdbc" % "3.51.3.0"
      )
    )
    .nativePlatform(
      scalaVersions = scalaVersions,
      axisValues = Seq.empty,
      configure = _.dependsOn(`scala-native-jdbc-sqlite`).settings(
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
    )

lazy val `scala-native-jdbc-duckdb-tests` = projectMatrix
  .in(file("scala-native-jdbc-duckdb-tests"))
  .settings(
    name := "scala-native-jdbc-duckdb-tests",
    noPublishSettings,
    libraryDependencies ++= Seq(
      "org.scalameta" %% "munit" % "1.3.3" % Test
    )
  )
  .jvmPlatform(
    scalaVersions = scalaVersions,
    settings = Seq(
      Test / fork := true,
      libraryDependencies += "org.duckdb" % "duckdb_jdbc" % "1.2.1"
    )
  )
  .nativePlatform(
    scalaVersions = scalaVersions,
    axisValues = Seq.empty,
    configure = _.dependsOn(`scala-native-jdbc-duckdb`).settings(
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
  )

lazy val root = project
  .in(file("."))
  .settings(
    name := "root",
    noPublishSettings
  )
  .autoAggregate

lazy val noPublishSettings = Seq(
  publish / skip := true
)
