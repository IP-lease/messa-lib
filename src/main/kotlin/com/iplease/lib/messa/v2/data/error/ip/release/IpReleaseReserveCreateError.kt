package com.iplease.lib.messa.v2.data.error.ip.release

import com.iplease.lib.messa.error.data.ErrorData
import com.iplease.lib.messa.v2.data.dto.IpReleaseReserveDto

data class IpReleaseReserveCreateError (
    val reserve: IpReleaseReserveDto,
    val cause: Throwable
): ErrorData