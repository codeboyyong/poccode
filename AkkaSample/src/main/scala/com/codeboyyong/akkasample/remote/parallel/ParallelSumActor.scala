package com.codeboyyong.akkasample.remote.parallel

import akka.actor.UntypedActor
import akka.actor.Actor
import com.codeboyyong.akkasample.util.AkkaUtil
import akka.actor.Address
import akka.actor.Props
import akka.actor.Deploy
import akka.remote.RemoteScope
case class CalculteSUM(start: Int, end: Int, numOfTasks: Int)

class ParallelSumActor() extends  Actor {

  def receive: Actor.Receive = {

    case CalculteSUM(start: Int, end: Int, numOfTasks: Int) => {
      if (numOfTasks > 8) {
        throw new Exception("task number can not bigger than 8")
      }
      val step = (end - start) / numOfTasks

      for (i <- 0 until numOfTasks) {
        val address = Address("akka.tcp", "system"+i, "localhost", 2557 + i)

        val actor = context.actorOf((Props[SumActor]).withDeploy(Deploy(scope = RemoteScope(address))))
        actor ! SUM(i*step  , (i+1)*step, "task_"+i )
      }

    }
    case SUMResult(sum: Double, id: String) => {
      println("task[" + id + "] finished, sum =" + sum)
    }

  }
}
 