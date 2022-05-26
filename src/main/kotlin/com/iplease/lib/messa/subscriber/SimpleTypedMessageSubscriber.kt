package com.iplease.lib.messa.subscriber

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule
import com.fasterxml.jackson.module.kotlin.registerKotlinModule
import com.iplease.lib.messa.MessageData
import com.iplease.lib.messa.MessageType
import com.iplease.lib.messa.exception.MessagePayloadParseException

abstract class SimpleTypedMessageSubscriber<D: MessageData, T: MessageType<D>>(
    private val type: T,
    private val data: D,
): TypedMessageSubscriber<D>() {
    override fun parse(payload: String): D {
        try {
            return ObjectMapper()
                .registerKotlinModule()
                .registerModule(JavaTimeModule())
                .readValue(payload, data::class.java)
        } catch (e: Throwable) { throw MessagePayloadParseException(cause = e, payload = payload) }
    }

    override fun checkRoutingKey(routingKey: String): Boolean = type.getRoutingKey() == routingKey
}