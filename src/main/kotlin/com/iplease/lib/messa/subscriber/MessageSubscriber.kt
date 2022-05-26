package com.iplease.lib.messa.subscriber

interface MessageSubscriber {
    fun subscribe(routingKey: String, payload: String)
}