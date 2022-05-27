package com.iplease.lib.messa.error.data.ip.demand

import com.iplease.lib.messa.error.data.ErrorData

@Deprecated("지원 중단된 MessageFormat 입니다.")
data class IpDemandCreateError (
    val demandUuid: Long,
): ErrorData