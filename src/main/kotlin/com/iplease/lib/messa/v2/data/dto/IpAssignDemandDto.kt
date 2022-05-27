package com.iplease.lib.messa.v2.data.dto

import com.iplease.lib.messa.v2.data.enum.AssignDemandStatus
import java.time.LocalDate

data class IpAssignDemandDto (
    val id: Long,
    val demanderId: Long,
    val title: String,
    val description: String,
    val expireAt: LocalDate,
    val status: AssignDemandStatus
)