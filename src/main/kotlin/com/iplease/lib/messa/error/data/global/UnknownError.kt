package com.iplease.lib.messa.error.data.global

@Deprecated("지원 중단된 MessageFormat 입니다.")
data class UnknownError (
    val errorMessage: String
) {
    fun toV2Data() = com.iplease.lib.messa.v2.data.error.UnknownError(errorMessage)
}