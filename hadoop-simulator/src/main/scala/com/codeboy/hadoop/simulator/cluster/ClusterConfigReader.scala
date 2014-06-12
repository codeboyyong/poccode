package com.codeboy.hadoop.simulator.cluster

import java.io.InputStreamReader
import com.typesafe.config.ConfigFactory
import com.typesafe.config.Config

object ClusterConfigReader {
  def readClusterConfig(): ClusterTopology = {
    val clusterConfReader = new InputStreamReader(ClusterMain.getClass().getResourceAsStream("cluster.conf"))
    val clusterConfig = ConfigFactory.parseReader(clusterConfReader)
    val namenodeHost = clusterConfig.getString("hadoop.simulator.namenode.host")
    val namenodePort = clusterConfig.getString("hadoop.simulator.namenode.port")

    val jobTrackerHost = clusterConfig.getString("hadoop.simulator.jobtracker.host")
    val jobTrackerPort = clusterConfig.getString("hadoop.simulator.jobtracker.port")

    val numOfDataNodes = clusterConfig.getInt("hadoop.simulator.datanodes.nubmer")
    val array = new Array[DataNode](numOfDataNodes)
    for (i <- 1 until numOfDataNodes) {
      val dataNodeHost = clusterConfig.getString("hadoop.simulator.datanodes." + i + ".host")
      val dataNodePort = clusterConfig.getInt("hadoop.simulator.datanodes." + i + ".port")

      array(i) = DataNode(dataNodeHost, dataNodePort)
    }
  
//    Cluster(null,null)
  }

  // val system = ActorSystem("myRemoteActorSystem", ConfigFactory.load(customConf))
}