package com.iplease.lib.messa.error.data.ip.demand

import com.iplease.lib.messa.error.data.ErrorData

data class IpDemandFailedError (
    val demandUuid: Long,
): ErrorData