package com.iplease.lib.messa.subscriber

import com.iplease.lib.messa.exception.MessagePayloadSerializeException

interface TypedMessageSubscriber<T: Any>: MessageSubscriber {
    override fun subscribe(routingKey: String, payload: String) {
        if(checkRoutingKey(routingKey)) return
        try { subscribe(deserialize(payload)) }
        catch (e: MessagePayloadSerializeException) { onWrongPayload(payload) }
    }

    fun onWrongPayload(payload: String)
    fun checkRoutingKey(routingKey: String): Boolean
    fun subscribe(payload: T)
    fun deserialize(payload: String): T
}