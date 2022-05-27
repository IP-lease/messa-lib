package com.iplease.lib.messa.error.data.global

import com.iplease.lib.messa.error.data.ErrorData

data class WrongPayloadError(
    val errorMessage: String,
    val message: String
): ErrorData