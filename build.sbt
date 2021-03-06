lazy val root = (project in file(".")).
  settings(
    name := "ScalaFizzBuzz",
    version := "1.0",
    scalaVersion := "2.11.6",
    libraryDependencies += "junit" % "junit" % "4.12" % Test,
    libraryDependencies += "org.scalatest" % "scalatest_2.11" % "2.2.4" % "test"

  )
