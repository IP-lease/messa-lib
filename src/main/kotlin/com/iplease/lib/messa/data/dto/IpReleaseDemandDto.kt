package com.iplease.lib.messa.data.dto

import com.iplease.lib.messa.data.type.ReleaseDemandStatus

data class IpReleaseDemandDto (
    val uuid: Long,
    val ip: AssignedIpDto,
    val status: ReleaseDemandStatus
)