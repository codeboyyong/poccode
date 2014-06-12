
name := "hadoopsimpulator"

version := "1.0"

organization := "codeboyyong"

//have to use 2.10.4 since scala ide in eclipse will force use it
scalaVersion := "2.10.4"

resolvers ++= Seq("Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/",
                  "Maven Central" at "http://repo1.maven.org",
                  "Spray Repo" at "http://repo.spray.io")

  libraryDependencies ++= {
    val akkaVersion = "2.3.2"
    val hadoopVersion = "1.0.4"
     Seq(
	"org.apache.hadoop"   %    "hadoop-core"                   %  hadoopVersion,
	"org.apache.hadoop"   %    "hadoop-client"                   %  hadoopVersion,
        "org.apache.hadoop"   %    "hadoop-minicluster"            %  hadoopVersion,
      "com.typesafe.akka"    %%    "akka-actor"                    %    akkaVersion,
      "com.typesafe.akka"    %%    "akka-remote"                   %    akkaVersion,
      "com.typesafe.akka"    %%    "akka-slf4j"                    %    akkaVersion,
      "com.typesafe.akka"    %%    "akka-testkit"                  %    akkaVersion,
      "com.typesafe.akka"    %%    "akka-kernel"                   %    akkaVersion,
      "com.typesafe.akka"    %%    "akka-cluster"                  %    akkaVersion,
      "com.typesafe.akka"    %%    "akka-persistence-experimental" % akkaVersion
    )
  }

javacOptions ++= Seq("-source", "1.6", "-target", "1.6")

scalacOptions ++= Seq("-unchecked", "-deprecation")

pollInterval := 1000

shellPrompt <<= name(name => { state: State =>
	object devnull extends ProcessLogger {
		def info(s: => String) {}
		def error(s: => String) { }
		def buffer[T](f: => T): T = f
	}
	val current = """\*\s+(\w+)""".r
	def gitBranches = ("git branch --no-color" lines_! devnull mkString)
	"%s:%s>" format (
		name,
		current findFirstMatchIn gitBranches map (_.group(1)) getOrElse "-"
	)
})

fork := true

fork in Test := false

javaOptions += "-Xmx2G"

parallelExecution := true

parallelExecution in Test := false
