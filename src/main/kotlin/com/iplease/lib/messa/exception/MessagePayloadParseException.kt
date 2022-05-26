package com.iplease.lib.messa.exception

class MessagePayloadParseException(
    cause: Throwable,
    val payload: String
) : MessageException("메세지 본문을 해석하는 도중, 오류가 발생하였습니다!", cause)