package com.iplease.lib.messa.error.data.global

import com.iplease.lib.messa.error.data.ErrorData

@Deprecated("지원 중단된 MessageFormat 입니다.")
data class WrongPayloadError(
    val errorMessage: String,
    val message: String
): ErrorData {
    fun toV2Data() = com.iplease.lib.messa.v2.data.error.WrongPayloadError(errorMessage, message)
}