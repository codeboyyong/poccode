cd /tmp/repalce_jar_zy
rm -rf *
jar xf /Users/zhaoyong/git/adl/AlpineMinerWeb/build_resource/lib_3rd/Cloudera_CDH4.3.0/sqoop-1.4.3-cdh4.3.0.jar
rm /Users/zhaoyong/git/adl/AlpineMinerWeb/build_resource/lib_3rd/Cloudera_CDH4.3.0/sqoop-1.4.3-cdh4.3.0.jar 
cp -rf /Users/zhaoyong/git/adl/AlpineMinerWeb/bin/org/apache/sqoop/  /tmp/repalce_jar_zy/org/apache/sqoop
jar cf /Users/zhaoyong/git/adl/AlpineMinerWeb/build_resource/lib_3rd/Cloudera_CDH4.3.0/sqoop-1.4.3-cdh4.3.0.jar  *
