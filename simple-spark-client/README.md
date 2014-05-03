simple-spark-sample
===============

export SPARK_JAR= /home/john/hadoop_soft/CDH5/spark-0.9.0-cdh5.0.0/spark-assembly_2.10-0.9.0-cdh5.0.0-hadoop2.3.0-cdh5.0.0.jar
mvn -D test=com.codeboy.simplesparkclient.JavaYarnClientParkPiTest test

Simple YARN application to run n copies of a unix command - deliberately kept simple (with minimal error handling etc.)

Usage(with Apache2.3.0):
======
Use mvn eclipse:eclipse to generate eclipse project

### Unmanaged mode
For 2.0.3
$ bin/hadoop jar $HADOOP_YARN_HOME/share/hadoop/yarn/hadoop-yarn-applications-unmanaged-am-launcher-2.3.0.jar Client -classpath simple-yarn-app-1.0-SNAPSHOT.jar -cmd "java com.hortonworks.simpleyarnapp.ApplicationMaster /bin/date 2"

For2.3.0-cdh5.0.0
$ bin/hadoop jar $HADOOP_YARN_HOME/share/hadoop/yarn/hadoop-yarn-applications-unmanaged-am-launcher-2.3.0-cdh5.0.0.jar Client -classpath simple-yarn-app-1.0-SNAPSHOT.jar -cmd "java com.hortonworks.simpleyarnapp.ApplicationMaster /bin/date 2"

You will the date out put is in the out of the yarn job.
In my case, it is /hadoop-2.3.0/logs/userlogs/application_1398635014957_0001/container_1398635014957_0001_01_000002

### Managed mode

$ bin/hadoop fs -copyFromLocal simple-yarn-app-1.0-SNAPSHOT.jar /apps/simple/simple-yarn-app-1.0-SNAPSHOT.jar

$ bin/hadoop jar simple-yarn-app-1.0-SNAPSHOT.jar com.hortonworks.simpleyarnapp.Client /bin/date 2 /apps/simple/simple-yarn-app-1.0-SNAPSHOT.jar
  
    
