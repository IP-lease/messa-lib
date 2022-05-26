package com.iplease.lib.messa.event.data.ip.demand.status

import com.iplease.lib.messa.event.data.EventData

data class IpDemandStatusRejectEvent (
    val demandUuid: Long,
): EventData