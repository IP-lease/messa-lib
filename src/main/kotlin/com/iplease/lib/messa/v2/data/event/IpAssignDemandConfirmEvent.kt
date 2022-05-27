package com.iplease.lib.messa.v2.data.event

import com.iplease.lib.messa.event.data.EventData
import com.iplease.lib.messa.v2.data.dto.IpAssignDemandDto

data class IpAssignDemandConfirmEvent(
    val demand: IpAssignDemandDto,
    val teacherId: Long
): EventData