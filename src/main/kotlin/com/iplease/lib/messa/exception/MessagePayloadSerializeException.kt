package com.iplease.lib.messa.exception

class MessagePayloadSerializeException(
    cause: Throwable,
    val payload: String
): MessageException("메세지 본문을 직렬화하는 도중, 오류가 발생하였습니다!", cause)