package com.iplease.lib.messa.v2.data.event

import com.iplease.lib.messa.event.data.EventData
import com.iplease.lib.messa.v2.data.dto.IpReleaseDemandDto

data class IpReleaseDemandCancelEvent (
    val demand: IpReleaseDemandDto
): EventData