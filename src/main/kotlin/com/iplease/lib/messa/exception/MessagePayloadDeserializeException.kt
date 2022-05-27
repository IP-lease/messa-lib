package com.iplease.lib.messa.exception

import com.iplease.lib.messa.MessageData

class MessagePayloadDeserializeException(
    cause: Throwable,
    val payload: MessageData
): MessageException("메세지 본문을 역직렬화하는 도중, 오류가 발생하였습니다!", cause)
