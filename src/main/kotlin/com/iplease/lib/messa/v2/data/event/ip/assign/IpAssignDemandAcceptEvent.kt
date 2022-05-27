package com.iplease.lib.messa.v2.data.event.ip.assign

import com.iplease.lib.messa.event.data.EventData
import com.iplease.lib.messa.v2.data.dto.IpAssignDemandDto
import com.iplease.lib.messa.v2.data.enum.IpString

data class IpAssignDemandAcceptEvent(
    val demand: IpAssignDemandDto,
    val teacherId: Long,
    val ip: IpString
): EventData