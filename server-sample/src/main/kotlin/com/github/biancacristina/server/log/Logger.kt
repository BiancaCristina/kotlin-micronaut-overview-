package com.github.biancacristina.server.log

import org.slf4j.Logger
import org.slf4j.LoggerFactory

inline fun <reified T> logger(): Logger = LoggerFactory.getLogger(T::class.java)
