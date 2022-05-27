package com.iplease.lib.messa.event.data.ip.demand

import com.iplease.lib.messa.event.data.EventData

@Deprecated("지원 중단된 MessageFormat 입니다.")
data class IpDemandFailedEvent (
    val demandUuid: Long,
): EventData