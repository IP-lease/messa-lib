package com.iplease.lib.messa.error.data.ip.demand.status

import com.iplease.lib.messa.error.data.ErrorData

data class IpDemandStatusRejectError (
    val demandUuid: Long,
): ErrorData