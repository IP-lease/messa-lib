package com.iplease.lib.messa.error.data.ip.demand
import com.iplease.lib.messa.error.data.ErrorData
import java.time.LocalDate

@Deprecated("지원 중단된 MessageFormat 입니다.")
data class IpDemandSuccessError (
    val demandUuid: Long,
    val issuerUuid: Long,
    val assignerUuid: Long,
    val assignedAt: LocalDate,
    val expireAt: LocalDate,
    val ipFirst: Int,
    val ipSecond: Int,
    val ipThird: Int,
    val ipFourth: Int
): ErrorData