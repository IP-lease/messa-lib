package com.iplease.lib.messa

import kotlin.reflect.KClass

interface MessageType<T: MessageData> {
    fun getRoutingKey(): String
    fun getPayloadType(): KClass<out T>
}