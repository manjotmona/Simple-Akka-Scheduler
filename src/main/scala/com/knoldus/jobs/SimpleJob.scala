package com.knoldus.jobs

import akka.actor.{Actor, Props}
import com.knoldus.jobs.SimpleJob.JobToDo
import com.knoldus.utility.LoggerHelper

object SimpleJob
{
    def props(): Props = Props(new SimpleJob)
    case object JobToDo

}

class SimpleJob extends Actor with LoggerHelper
{
    override def receive =
    {
        case JobToDo => log.info("This actor has received a JobToDo message")
        case _ => log.info("This actor has received an invalid message")
    }
}
