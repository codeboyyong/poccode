package com.codeboyyong.akkasample.remote.parallel

import com.codeboyyong.akkasample.util.AkkaUtil
import akka.actor.Address
import akka.actor.Props
import akka.actor.Deploy
import akka.remote.RemoteScope
import akka.actor.ActorSystem
/***
 * This demo is quite easy to be run on differetn remote mathine
 * kind of like hadoop map reduce cluster !
 * So we can create kind of hadoop simulator!!!
 */
object RemoteParalleDemos extends App{
//  val system1 = AkkaUtil.startAkkaRemoteSystem("localhost", "2557", "system1")
//  
//  val system2 = AkkaUtil.startAkkaRemoteSystem("localhost", "2558", "system2")
val PARALLEL = 5;
for(i<-0 until PARALLEL){
   AkkaUtil.startAkkaRemoteSystem("localhost", 2557+i+"", "system"+i)
}
   val localSystem = ActorSystem("mylocalsystem")
   val parallelSum =localSystem.actorOf(Props[ParallelSumActor])
  
   parallelSum !  CalculteSUM(1, 50000, PARALLEL)
  
}