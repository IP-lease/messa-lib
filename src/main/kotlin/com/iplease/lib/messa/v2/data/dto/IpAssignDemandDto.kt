package com.iplease.lib.messa.v2.data.dto

import com.iplease.lib.messa.v2.data.type.AssignDemandStatus

data class IpAssignDemandDto (
    val uuid: Long,
    val demanderUuid: Long,
    val title: String,
    val description: String,
    val status: AssignDemandStatus
)