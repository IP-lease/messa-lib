package com.iplease.lib.messa.v2.publisher

import com.iplease.lib.messa.MessageData
import com.iplease.lib.messa.v2.exception.MessagePayloadDeserializeException

interface TypedMessagePublisher: MessagePublisher {
    fun <T: MessageData> publish(routingKey: String, payload: T) {
        try{ publish(routingKey, serialize(payload)) }
        catch (e: MessagePayloadDeserializeException) { onWrongPayload(payload) }
    }

    fun <T> onWrongPayload(payload: T)
    fun <T: MessageData> serialize(payload: T): String
}