package com.iplease.lib.messa.v2.data.dto

import java.time.LocalDate

data class IpReleaseReserveDto (
    val id: Long = -1,
    val ip: AssignedIpDto = AssignedIpDto(),
    val expireAt: LocalDate = LocalDate.MIN
)