package com.iplease.lib.messa.ip.release

data class IpReleaseSuccessEvent (
    val assignedIpUuid: Long,
    val demandUuid: Long,
    val operatorUuid: Long
)