package com.iplease.lib.messa.publisher

interface MessagePublisher {
    fun publish(routingKey: String, payload: String)
}