package com.iplease.lib.messa.data.dto

data class AssignedIpDto (
    val uuid: Long,
    val ownerUuid: Long,
    val assignerUuid: Long,
    val ip: String
)