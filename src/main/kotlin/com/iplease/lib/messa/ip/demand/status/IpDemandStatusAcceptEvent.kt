package com.iplease.lib.messa.ip.demand.status

data class IpDemandStatusAcceptEvent (
    val demandUuid: Long,
    val issuerUuid: Long,
    val managerUuid: Long,
    val demandedIp: String
)