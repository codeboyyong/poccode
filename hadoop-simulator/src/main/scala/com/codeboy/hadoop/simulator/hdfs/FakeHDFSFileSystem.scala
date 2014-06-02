package com.codeboy.hadoop.simulator.hdfs

import com.codeboy.hadoop.simulator.cluster.ClusterTopology

/***
 * Just a demo
 * no replication,
 * no permission
 * no security
 * no secondary name node
 * only contain line based text file
 * block size is 100K (configurabel, max 300K)
 * max file size 10M
 * totally in memory, but restart is OK 
 * when starting will make every datanede load data into memory
 * 
 * 
 * "fakehdfs://csv/golf.csv"
 * or "/csv/golf.csv"
 * 
 * Repository is in ~/.hadoopsimulator
 */
class FakeHDFSFileSystem (clusterConfig:ClusterTopology){
//  read
//  write
//  readblock
//  getHDFSFileMetaData

}