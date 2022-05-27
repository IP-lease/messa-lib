package com.iplease.lib.messa.error.data.ip.demand.info

import com.iplease.lib.messa.error.data.ErrorData

@Deprecated("지원 중단된 MessageFormat 입니다.")
data class IpDemandInfoUpdateError (
    val demandUuid: Long,
): ErrorData