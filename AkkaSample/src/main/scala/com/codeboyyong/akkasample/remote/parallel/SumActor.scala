package com.codeboyyong.akkasample.remote.parallel

import akka.actor.UntypedActor
import akka.actor.Actor
import com.codeboyyong.akkasample.util.AkkaUtil
import akka.actor.Address

case class SUM(start: Int, end: Int, taskId: String)

case class SUMResult(sum: Double, id: String)

class SumActor extends  Actor {
  def receive: Actor.Receive = {
    case SUM(start: Int, end: Int, taskId: String) => {
      var result: Double = 0;
      for (i <- start until end) {
        result = result + i
      }

      println("result:" + result)
      sender ! SUMResult(result, taskId)
    }

  }
}
 