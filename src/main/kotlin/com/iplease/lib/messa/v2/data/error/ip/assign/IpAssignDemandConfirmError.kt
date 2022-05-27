package com.iplease.lib.messa.v2.data.error.ip.assign

import com.iplease.lib.messa.error.data.ErrorData
import com.iplease.lib.messa.v2.data.dto.IpAssignDemandDto

data class IpAssignDemandConfirmError(
    val demand: IpAssignDemandDto,
    val teacherId: Long,
    val cause: Throwable
): ErrorData