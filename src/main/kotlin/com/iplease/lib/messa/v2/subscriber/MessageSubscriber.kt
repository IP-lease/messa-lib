package com.iplease.lib.messa.v2.subscriber

interface MessageSubscriber {
    fun subscribe(routingKey: String, payload: String)
}