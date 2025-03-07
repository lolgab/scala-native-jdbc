val scala3 = "3.3.4"

lazy val `scala-native-jdbc` = project
  .in(file("scala-native-jdbc"))
  .settings(
    name := "scala-native-jdbc",
    scalaVersion := scala3
  )
  .enablePlugins(ScalaNativePlugin)

lazy val `scala-native-jdbc-sqlite` = project
  .in(file("scala-native-jdbc-sqlite"))
  .settings(
    name := "scala-native-jdbc-sqlite",
    scalaVersion := scala3,
    Compile / resourceGenerators += Def.task {
      val url = "https://sqlite.org/2025/sqlite-amalgamation-3490100.zip"
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
          tempDir / "sqlite-amalgamation-3490100" / "sqlite3.c"
        IO.copyFile(sqlite3File, targetDir / "sqlite3.c")
        Seq(targetDir / "sqlite3.c")
      } finally {
        // Cleanup
        IO.delete(tempDir)
      }
    }.taskValue
  )
  .enablePlugins(ScalaNativePlugin)
  .dependsOn(`scala-native-jdbc`)

lazy val `scala-native-jdbc-tests` = crossProject(JVMPlatform, NativePlatform)
  .crossType(CrossType.Pure)
  .in(file("scala-native-jdbc-tests"))
  .settings(
    name := "scala-native-jdbc-tests",
    scalaVersion := scala3,
    libraryDependencies ++= Seq(
      "org.scalameta" %%% "munit" % "1.0.0" % Test
    ),
    publish / skip := true
  )
  .nativeSettings(
    nativeConfig ~= {
      _.withServiceProviders(
        Map(
          "java.sql.Driver" -> Seq("com.github.lolgab.jdbc.sqlite.SQLiteDriver")
        )
      )
    }
  )
  .nativeConfigure(
    _.dependsOn(`scala-native-jdbc-sqlite`)
  )
  .jvmSettings(
    libraryDependencies ++= Seq(
      "org.xerial" % "sqlite-jdbc" % "3.43.0.0"
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
    publish / skip := true
  )
  .aggregate(
    `scala-native-jdbc`,
    `scala-native-jdbc-sqlite`,
    `scala-native-jdbc-tests`.jvm,
    `scala-native-jdbc-tests`.native
  )
