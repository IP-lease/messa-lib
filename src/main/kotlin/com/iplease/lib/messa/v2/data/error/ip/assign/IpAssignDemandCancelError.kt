package com.iplease.lib.messa.v2.data.error.ip.assign

import com.iplease.lib.messa.error.data.ErrorData
import com.iplease.lib.messa.v2.data.dto.IpAssignDemandDto

data class IpAssignDemandCancelError (
    val demand: IpAssignDemandDto,
    val cause: Throwable
): ErrorData