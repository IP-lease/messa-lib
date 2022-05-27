package com.iplease.lib.messa.v2.data.dto

import java.time.LocalDate

data class IpReleaseReserveDto (
    val uuid: Long,
    val ip: AssignedIpDto,
    val expireAt: LocalDate
)