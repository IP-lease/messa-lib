package com.iplease.lib.messa.v2.publisher

interface MessagePublisher {
    fun publish(routingKey: String, payload: String)
}