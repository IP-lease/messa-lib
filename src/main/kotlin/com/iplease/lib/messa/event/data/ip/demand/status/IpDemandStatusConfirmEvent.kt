package com.iplease.lib.messa.event.data.ip.demand.status

import com.iplease.lib.messa.event.data.EventData

@Deprecated("지원 중단된 MessageFormat 입니다.")
data class IpDemandStatusConfirmEvent (
    val demandUuid: Long,
): EventData