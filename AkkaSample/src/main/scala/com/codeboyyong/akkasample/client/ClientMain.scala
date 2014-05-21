package com.alpine.rconnector.client

import com.typesafe.config.ConfigFactory
import akka.actor.{Props, ActorSystem}
import com.alpine.rconnector.messages.{RStart, RStop, RRequest}

object ClientMain extends App {
  val serverUrl = "akka.tcp://myRemoteActorSystem@127.0.0.1:2553"

  val clientSystem = ActorSystem("client", ConfigFactory.load(ConfigFactory.parseString( """
  akka {
    actor {
      provider = "akka.remote.RemoteActorRefProvider"
    }
     remote {
      transport = "akka.remote.netty.tcp"
      }
  }

   //remember , "user" in the path is hardcoded.                                                                                        """)))
  val remoteServer = clientSystem.actorSelection(serverUrl + "/user/myRemoteActor")

  remoteServer ! "HEY"
  remoteServer ! 123
}