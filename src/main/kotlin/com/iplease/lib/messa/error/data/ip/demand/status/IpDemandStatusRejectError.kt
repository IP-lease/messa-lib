package com.iplease.lib.messa.error.data.ip.demand.status

import com.iplease.lib.messa.error.data.ErrorData

@Deprecated("지원 중단된 MessageFormat 입니다.")
data class IpDemandStatusRejectError (
    val demandUuid: Long,
): ErrorData