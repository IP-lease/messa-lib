package com.iplease.lib.messa.error.data.ip.release

import com.iplease.lib.messa.error.data.ErrorData

@Deprecated("지원 중단된 MessageFormat 입니다.")
data class IpReleaseSuccessError (
    val assignedIpUuid: Long,
    val demandUuid: Long,
    val operatorUuid: Long
): ErrorData