package com.knoldus.utility

import org.apache.log4j.Logger

trait LoggerHelper
{
    val log : Logger = Logger.getLogger(this.getClass)
}
