package com.iplease.lib.messa.event.type

import com.iplease.lib.messa.event.data.ip.release.IpReleaseSuccessEvent
import kotlin.reflect.KClass

@Suppress("unused")
enum class IpReleaseEventTypeV1(
    val routingKey: String,
    val eventPayloadType: KClass<*>
) {
    IP_RELEASE_SUCCESS("v1.event.ip.release.released", IpReleaseSuccessEvent::class);
}