package com.iplease.lib.messa.v2.data.dto

import com.iplease.lib.messa.v2.data.enum.AssignDemandStatus
import java.time.LocalDate

data class IpAssignDemandDto (
    val id: Long = -1,
    val demanderId: Long = -1,
    val title: String = "",
    val description: String = "",
    val expireAt: LocalDate = LocalDate.MIN,
    val status: AssignDemandStatus = AssignDemandStatus.CREATE
)