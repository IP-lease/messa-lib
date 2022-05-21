package com.iplease.lib.messa.error.data.ip.release

data class IpReleaseSuccessError (
    val assignedIpUuid: Long,
    val demandUuid: Long,
    val operatorUuid: Long
)