package com.iplease.lib.messa.subscriber

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule
import com.fasterxml.jackson.module.kotlin.registerKotlinModule
import com.iplease.lib.messa.MessageData
import com.iplease.lib.messa.MessageType
import com.iplease.lib.messa.error.data.global.WrongPayloadError
import com.iplease.lib.messa.error.type.GlobalErrorTypeV1
import com.iplease.lib.messa.exception.MessagePayloadSerializeException
import com.iplease.lib.messa.publisher.TypedMessagePublisher

abstract class SimpleTypedMessageSubscriber<D: MessageData, T: MessageType<D>>(
    private val type: T,
    private val data: D,
    private val messagePublisher: TypedMessagePublisher<WrongPayloadError>
): TypedMessageSubscriber<D> {
    final override fun deserialize(payload: String): D {
        try {
            return ObjectMapper()
                .registerKotlinModule()
                .registerModule(JavaTimeModule())
                .readValue(payload, data::class.java)
        } catch (e: Throwable) { throw MessagePayloadSerializeException(cause = e, payload = payload) }
    }

    final override fun checkRoutingKey(routingKey: String): Boolean = type.getRoutingKey() == routingKey
    final override fun onWrongPayload(payload: String) =
        messagePublisher.publish(
            routingKey = GlobalErrorTypeV1.WRONG_PAYLOAD.getRoutingKey(),
            payload = WrongPayloadError(payload)
        )
}