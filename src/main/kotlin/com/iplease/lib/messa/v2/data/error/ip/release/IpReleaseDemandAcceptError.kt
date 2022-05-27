package com.iplease.lib.messa.v2.data.error.ip.release

import com.iplease.lib.messa.error.data.ErrorData
import com.iplease.lib.messa.v2.data.dto.IpReleaseDemandDto

data class IpReleaseDemandAcceptError (
    val demand: IpReleaseDemandDto,
    val teacherId: Long,
    val cause: Throwable
): ErrorData