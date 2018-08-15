enablePlugins(ScalaJSPlugin)

name := "Racket_SAM_test"

version := "0.1"

scalaVersion := "2.12.4"

// This is an application with a main method
scalaJSUseMainModuleInitializer := true

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % "test"

libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.9.6"

libraryDependencies += "org.querki" %%% "jquery-facade" % "1.2"