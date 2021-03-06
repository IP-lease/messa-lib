package com.iplease.lib.messa.v2.data.error.global

import com.iplease.lib.messa.error.data.ErrorData

data class WrongPayloadError(
    val error: String,
    val payload: String
): ErrorData