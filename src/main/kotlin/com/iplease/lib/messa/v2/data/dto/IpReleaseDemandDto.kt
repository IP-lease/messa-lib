package com.iplease.lib.messa.v2.data.dto

import com.iplease.lib.messa.v2.data.enum.ReleaseDemandStatus

data class IpReleaseDemandDto (
    val id: Long = -1,
    val ip: AssignedIpDto = AssignedIpDto(),
    val status: ReleaseDemandStatus = ReleaseDemandStatus.CREATE
)