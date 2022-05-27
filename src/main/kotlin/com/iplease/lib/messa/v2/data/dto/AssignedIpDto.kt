package com.iplease.lib.messa.v2.data.dto

data class AssignedIpDto (
    val id: Long = -1,
    val ownerId: Long = -1,
    val assignerId: Long = -1,
    val ip: String = ""
)