lazy val commonSettings = Seq(
  organization := "com.github.cornerman",
  version      := "0.1.0-SNAPSHOT",

  scalaVersion := "2.12.4",
  crossScalaVersions := Seq("2.11.11", "2.12.4"),

  scalacOptions ++=
    "-encoding" :: "UTF-8" ::
    "-unchecked" ::
    "-deprecation" ::
    "-explaintypes" ::
    "-feature" ::
    "-language:_" ::
    "-Xfuture" ::
    "-Xlint" ::
    "-Ypartial-unification" ::
    "-Yno-adapted-args" ::
    "-Ywarn-infer-any" ::
    "-Ywarn-value-discard" ::
    "-Ywarn-nullary-override" ::
    "-Ywarn-nullary-unit" ::
    "-Ywarn-unused" ::
    Nil,

  scalacOptions ++= {
    CrossVersion.partialVersion(scalaVersion.value) match {
      case Some((2, 12)) =>
        "-Ywarn-extra-implicit" ::
        Nil
      case _ =>
        Nil
    }
  },

  addCompilerPlugin("org.spire-math" %% "kind-projector" % "0.9.4")
)

lazy val modernizr = project
  .enablePlugins(ScalaJSPlugin, ScalaJSBundlerPlugin)
  .settings(commonSettings)
  .settings(
    name := "scala-js-modernizr",
    npmDependencies in Compile ++=
      "modernizr" -> "3.6.0" ::
      Nil,
    libraryDependencies ++=
      "org.scala-js" %%% "scalajs-dom" % "0.9.4" ::
      Nil
  )

