package com.iplease.lib.messa.v2.data.event.ip.assign

import com.iplease.lib.messa.event.data.EventData
import com.iplease.lib.messa.v2.data.dto.IpAssignDemandDto

data class IpAssignDemandCreateEvent (
    val demand: IpAssignDemandDto
): EventData