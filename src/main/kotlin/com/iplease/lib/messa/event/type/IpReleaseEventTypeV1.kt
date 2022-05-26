package com.iplease.lib.messa.event.type

import com.iplease.lib.messa.event.data.EventData
import com.iplease.lib.messa.event.data.ip.release.IpReleaseSuccessEvent
import kotlin.reflect.KClass

@Suppress("unused")
enum class IpReleaseEventTypeV1(
    private val routingKey: String,
    private val eventPayloadType: KClass<out EventData>
): EventType {
    IP_RELEASE_SUCCESS("v1.event.ip.release.released", IpReleaseSuccessEvent::class);

    override fun getRoutingKey(): String = routingKey
    override fun getPayloadType(): KClass<out EventData> = eventPayloadType
}