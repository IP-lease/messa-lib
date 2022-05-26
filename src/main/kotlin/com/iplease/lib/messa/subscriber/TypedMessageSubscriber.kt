package com.iplease.lib.messa.subscriber

import com.iplease.lib.messa.exception.MessagePayloadParseException

abstract class TypedMessageSubscriber<T: Any>: MessageSubscriber {
    final override fun subscribe(routingKey: String, payload: String) {
        if(checkRoutingKey(routingKey)) return
        try { subscribe(parse(payload)) }
        catch (e: MessagePayloadParseException) {  }//TODO WrongPayloadError 발행하기
    }

    abstract fun checkRoutingKey(routingKey: String): Boolean
    abstract fun subscribe(payload: T)
    abstract fun parse(payload: String): T
}