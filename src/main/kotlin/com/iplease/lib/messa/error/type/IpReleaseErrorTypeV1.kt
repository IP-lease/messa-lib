package com.iplease.lib.messa.error.type

import com.iplease.lib.messa.error.data.ip.release.IpReleaseSuccessError
import kotlin.reflect.KClass

@Suppress("unused")
enum class IpReleaseErrorTypeV1(
    val routingKey: String,
    val errorPayloadType: KClass<*>
) {
    IP_RELEASE_SUCCESS("v1.error.ip.release.released", IpReleaseSuccessError::class);
}