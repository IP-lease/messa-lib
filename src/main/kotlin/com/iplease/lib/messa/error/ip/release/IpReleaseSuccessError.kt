package com.iplease.lib.messa.error.ip.release

data class IpReleaseSuccessError (
    val assignedIpUuid: Long,
    val demandUuid: Long,
    val operatorUuid: Long
)