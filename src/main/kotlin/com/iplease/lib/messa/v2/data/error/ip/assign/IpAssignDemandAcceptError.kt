package com.iplease.lib.messa.v2.data.error.ip.assign

import com.iplease.lib.messa.error.data.ErrorData
import com.iplease.lib.messa.v2.data.dto.IpAssignDemandDto
import com.iplease.lib.messa.v2.data.type.IpString

data class IpAssignDemandAcceptError(
    val demand: IpAssignDemandDto,
    val teacherId: Long,
    val ip: IpString,
    val cause: Throwable
): ErrorData