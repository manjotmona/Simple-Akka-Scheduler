package com.knoldus.scheduler

import akka.actor.Cancellable
import com.knoldus.jobs.SimpleJob
import scala.concurrent.duration._
import scala.concurrent.ExecutionContext.Implicits.global

class AkkaJobScheduler
{
    def run : Cancellable =
    {
        val system = akka.actor.ActorSystem("system")
        val simpleJob = system.actorOf(SimpleJob.props(), "simple-job")

        system.scheduler.schedule(0 milliseconds,50 milliseconds, simpleJob, "foo")
    }
}
