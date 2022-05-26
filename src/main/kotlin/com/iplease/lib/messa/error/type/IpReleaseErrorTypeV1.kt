package com.iplease.lib.messa.error.type

import com.iplease.lib.messa.error.data.ErrorData
import com.iplease.lib.messa.error.data.ip.release.IpReleaseSuccessError
import kotlin.reflect.KClass

@Suppress("unused")
enum class IpReleaseErrorTypeV1(
    private val routingKey: String,
    private val errorPayloadType: KClass<out ErrorData>
): ErrorType {
    IP_RELEASE_SUCCESS("v1.error.ip.release.released", IpReleaseSuccessError::class);

    override fun getRoutingKey(): String = routingKey
    override fun getPayloadType(): KClass<out ErrorData> = errorPayloadType
}