package com.iplease.lib.messa.event.data.ip.demand.status

data class IpDemandStatusAcceptEvent (
    val demandUuid: Long,
    val issuerUuid: Long,
    val managerUuid: Long,
    val demandedIp: String
)