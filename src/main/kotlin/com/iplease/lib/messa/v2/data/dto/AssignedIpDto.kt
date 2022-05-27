package com.iplease.lib.messa.v2.data.dto

data class AssignedIpDto (
    val id: Long,
    val ownerId: Long,
    val assignerId: Long,
    val ip: String
)