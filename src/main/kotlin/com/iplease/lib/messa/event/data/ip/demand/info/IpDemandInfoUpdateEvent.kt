package com.iplease.lib.messa.event.data.ip.demand.info

import com.iplease.lib.messa.event.data.EventData

data class IpDemandInfoUpdateEvent(
    val demandUuid: Long
): EventData