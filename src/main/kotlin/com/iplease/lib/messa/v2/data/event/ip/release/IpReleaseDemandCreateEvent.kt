package com.iplease.lib.messa.v2.data.event.ip.release

import com.iplease.lib.messa.event.data.EventData
import com.iplease.lib.messa.v2.data.dto.IpReleaseDemandDto

data class IpReleaseDemandCreateEvent(
    val demand: IpReleaseDemandDto
): EventData
