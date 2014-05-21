package com.codeboyyong.akkasample.server

import akka.actor._

import scala.util.Failure
import scala.Some
import scala.util.Success


class MyRemoteActor( )
    extends Actor  {


  def receive: Actor.Receive = {
    case str:String  => println("MyRemoteActor:get a string :" +str)
    case intValue:Integer  => println("MyRemoteActor:get a int :" +intValue)
    case obj:Object => println("MyRemoteActor:get a message :" +obj.toString)


  }


}
