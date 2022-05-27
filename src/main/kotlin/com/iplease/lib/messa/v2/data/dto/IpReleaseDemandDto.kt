package com.iplease.lib.messa.v2.data.dto

import com.iplease.lib.messa.v2.data.type.ReleaseDemandStatus

data class IpReleaseDemandDto (
    val id: Long,
    val ip: AssignedIpDto,
    val status: ReleaseDemandStatus
)