name := "odinson-core"

libraryDependencies ++= {

  val luceneVersion = "6.6.5"

  Seq(
    "org.scalatest" %% "scalatest" % "3.0.5" % "test",
    "com.typesafe.scala-logging" %% "scala-logging" % "3.5.0",
    "ch.qos.logback" %  "logback-classic" % "1.1.10",
    "ai.lum" %% "common" % "0.0.8",
    "org.apache.lucene" % "lucene-core" % luceneVersion,
    "org.apache.lucene" % "lucene-queryparser" % luceneVersion,
    "org.apache.lucene" % "lucene-highlighter" % luceneVersion,
    "com.ibm.icu" % "icu4j" % "54.1",
    "com.lihaoyi" %% "fastparse" % "2.1.0",
    "com.twitter" %% "chill" % "0.9.3"
  )

}
