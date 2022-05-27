package com.iplease.lib.messa.v2.data.error

import com.iplease.lib.messa.error.data.ErrorData

data class WrongPayloadError(
    val errorMessage: String,
    val message: String
): ErrorData