package com.iplease.lib.messa.publisher

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule
import com.fasterxml.jackson.module.kotlin.registerKotlinModule
import com.iplease.lib.messa.MessageData
import com.iplease.lib.messa.MessageType
import com.iplease.lib.messa.exception.MessagePayloadDeserializeException

abstract class SimpleTypedMessagePublisher: TypedMessagePublisher {
    final override fun <T: MessageData>serialize(payload: T): String {
        try {
            return ObjectMapper()
                .registerKotlinModule()
                .registerModule(JavaTimeModule())
                .writeValueAsString(payload)
        } catch (e: Throwable) { throw MessagePayloadDeserializeException(cause = e, payload = payload) }
    }

    override fun <T: MessageData>publish(routingKey: String, payload: T) =
        publish(routingKey, serialize(payload))

    override fun <T>onWrongPayload(payload: T) {}
}