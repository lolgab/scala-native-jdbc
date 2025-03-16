import xerial.sbt.Sonatype._

ThisBuild / version := "0.0.2-SNAPSHOT"
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
    noPublishSettings,
    libraryDependencies ++= Seq(
      "org.scalameta" %%% "munit" % "1.0.0" % Test
    )
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

lazy val root = project
  .in(file("."))
  .settings(
    name := "root",
    noPublishSettings
  )
  .aggregate(
    `scala-native-jdbc`,
    `scala-native-jdbc-sqlite`,
    `scala-native-jdbc-tests`.jvm,
    `scala-native-jdbc-tests`.native
  )

lazy val noPublishSettings = Seq(
  publish / skip := true
)
