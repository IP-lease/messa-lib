package com.iplease.lib.messa.v2.data.error.ip.assign

import com.iplease.lib.messa.error.data.ErrorData
import com.iplease.lib.messa.v2.data.dto.IpAssignDemandDto

data class IpAssignDemandRejectError(
    val demand: IpAssignDemandDto,
    val teacherId: Long,
    val reason: String,
    val cause: Throwable
): ErrorData
