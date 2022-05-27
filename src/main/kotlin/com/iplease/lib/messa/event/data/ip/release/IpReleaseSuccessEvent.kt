package com.iplease.lib.messa.event.data.ip.release

import com.iplease.lib.messa.event.data.EventData

@Deprecated("지원 중단된 MessageFormat 입니다.")
data class IpReleaseSuccessEvent (
    val assignedIpUuid: Long,
    val demandUuid: Long,
    val operatorUuid: Long
): EventData