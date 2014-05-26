package com.codeboyyong.akkasample.server

 import akka.actor.{Props, ActorSystem}
import com.codeboyyong.akkasample.actor.MyRemoteActor
 


object ServerMainConfigFile extends App {
  import akka.actor.ActorSystem
  import com.typesafe.config.ConfigFactory
  
  //auto found the ocnfig application.conf
  val system = ActorSystem("myRemoteActorSystem")
  val actor =  system.actorOf(Props[MyRemoteActor],"myRemoteActor")
  actor ! "the remote is up"
 }