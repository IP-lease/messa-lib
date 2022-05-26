package com.iplease.lib.messa.event.data.ip.demand

import com.iplease.lib.messa.event.data.EventData

data class IpDemandCreateEvent (
    val demandUuid: Long,
): EventData