package com.iplease.lib.messa.v2.data.error.subnet

import com.iplease.lib.messa.error.data.ErrorData
import com.iplease.lib.messa.event.data.EventData
import com.iplease.lib.messa.v2.data.dto.SubnetDto

data class SubnetDeleteError (
    val subnet: SubnetDto,
    val teacherId: Long,
    val cause: Throwable
): ErrorData