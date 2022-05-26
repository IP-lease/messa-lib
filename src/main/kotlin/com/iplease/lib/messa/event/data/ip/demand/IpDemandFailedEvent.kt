package com.iplease.lib.messa.event.data.ip.demand

import com.iplease.lib.messa.event.data.EventData

data class IpDemandFailedEvent (
    val demandUuid: Long,
): EventData