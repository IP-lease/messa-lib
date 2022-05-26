package com.iplease.lib.messa.error.data.global

import com.iplease.lib.messa.error.data.ErrorData

data class WrongPayloadError(
    val message: String
): ErrorData