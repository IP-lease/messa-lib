package com.iplease.lib.messa.error.type

import com.iplease.lib.messa.error.data.global.UnknownError
import com.iplease.lib.messa.error.data.global.WrongPayloadError
import kotlin.reflect.KClass

@Suppress("unused")
enum class GlobalErrorTypeV1(
    val routingKey: String,
    val errorPayloadType: KClass<*>
) {
    WRONG_PAYLOAD("v1.error.wrong_payload", WrongPayloadError::class),
    UNKNOWN_ERROR("v1.error.unknown", UnknownError::class);
}