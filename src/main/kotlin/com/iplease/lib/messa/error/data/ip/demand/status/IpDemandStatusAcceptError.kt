package com.iplease.lib.messa.error.data.ip.demand.status

data class IpDemandStatusAcceptError (
    val demandUuid: Long,
    val issuerUuid: Long,
    val managerUuid: Long,
    val demandedIp: String
)