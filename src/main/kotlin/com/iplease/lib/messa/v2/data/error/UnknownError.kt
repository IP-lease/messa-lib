package com.iplease.lib.messa.v2.data.error

import com.iplease.lib.messa.error.data.ErrorData

data class UnknownError (
    val error: String
): ErrorData