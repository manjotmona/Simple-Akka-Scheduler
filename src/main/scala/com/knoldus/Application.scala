package com.knoldus

import com.knoldus.scheduler.AkkaJobScheduler


object Application extends App
{
    val akkaJobScheduler = new AkkaJobScheduler()
    akkaJobScheduler.run
}
