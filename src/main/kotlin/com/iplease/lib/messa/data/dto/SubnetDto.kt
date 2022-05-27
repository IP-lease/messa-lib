package com.iplease.lib.messa.data.dto

data class SubnetDto (
    val uuid: Long,
    val registrantUuid: Long,
    val subnetFirst: Int,
    val subnetSecond: Int,
    val subnetThird: Int
)