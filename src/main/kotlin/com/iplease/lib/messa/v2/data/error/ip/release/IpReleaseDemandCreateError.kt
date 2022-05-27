package com.iplease.lib.messa.v2.data.error.ip.release

import com.iplease.lib.messa.error.data.ErrorData
import com.iplease.lib.messa.v2.data.dto.IpReleaseDemandDto

data class IpReleaseDemandCreateError (
    val demand: IpReleaseDemandDto,
    val cause: Throwable
): ErrorData