package com.iplease.lib.messa.v2.exception

open class MessageException(
    msg: String,
    cause: Throwable
): RuntimeException(msg, cause)