package com.iplease.lib.messa.event.data.ip.release

import com.iplease.lib.messa.event.data.EventData

data class IpReleaseSuccessEvent (
    val assignedIpUuid: Long,
    val demandUuid: Long,
    val operatorUuid: Long
): EventData