package com.iplease.lib.messa.v2.subscriber

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule
import com.fasterxml.jackson.module.kotlin.registerKotlinModule
import com.iplease.lib.messa.MessageData
import com.iplease.lib.messa.MessageType
import com.iplease.lib.messa.error.type.GlobalErrorTypeV1
import com.iplease.lib.messa.v2.data.error.global.WrongPayloadError
import com.iplease.lib.messa.v2.exception.MessagePayloadSerializeException
import com.iplease.lib.messa.v2.publisher.TypedMessagePublisher

abstract class SimpleTypedMessageSubscriber<D: MessageData, T: MessageType<D>>(
    private val type: T,
    private val data: D,
    private val messagePublisher: TypedMessagePublisher
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
            payload = WrongPayloadError("이벤트 구독을 위한 역직렬화 도중 오류가 발생하였습니다!", payload)
        )
}