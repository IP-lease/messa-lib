package com.iplease.lib.messa.exception

open class MessageException(
    msg: String,
    cause: Throwable
): RuntimeException(msg, cause)