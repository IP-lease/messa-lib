package com.iplease.lib.messa.v2.data.dto

data class AssignedIpDto (
    val uuid: Long,
    val ownerUuid: Long,
    val assignerUuid: Long,
    val ip: String
)