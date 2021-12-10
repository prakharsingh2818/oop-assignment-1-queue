import sbt.Keys.libraryDependencies

ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.7"

lazy val root = (project in file("."))
  .settings(
    name := "OOPAssignment1" ,
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.10" % "test"
  )
