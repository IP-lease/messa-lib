package com.iplease.lib.messa.error.data.ip.release

import com.iplease.lib.messa.error.data.ErrorData

data class IpReleaseSuccessError (
    val assignedIpUuid: Long,
    val demandUuid: Long,
    val operatorUuid: Long
): ErrorData