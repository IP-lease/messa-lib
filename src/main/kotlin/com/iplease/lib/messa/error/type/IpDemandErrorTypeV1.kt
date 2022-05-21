package com.iplease.lib.messa.error.type

import com.iplease.lib.messa.error.data.ip.demand.IpDemandCreateError
import com.iplease.lib.messa.error.data.ip.demand.IpDemandFailedError
import com.iplease.lib.messa.error.data.ip.demand.IpDemandSuccessError
import com.iplease.lib.messa.error.data.ip.demand.info.IpDemandInfoUpdateError
import com.iplease.lib.messa.error.data.ip.demand.status.IpDemandStatusAcceptError
import com.iplease.lib.messa.error.data.ip.demand.status.IpDemandStatusConfirmError
import com.iplease.lib.messa.error.data.ip.demand.status.IpDemandStatusRejectError
import kotlin.reflect.KClass

@Suppress("unused")
enum class IpDemandErrorTypeV1(
    val routingKey: String,
    val errorPayloadType: KClass<*>
) {
    IP_DEMAND_INFO_UPDATE("v1.error.ip.demand.info.update", IpDemandInfoUpdateError::class),
    IP_DEMAND_CREATE("v1.error.ip.demand.create", IpDemandCreateError::class),
    IP_DEMAND_STATUS_CONFIRM("v1.error.ip.demand.status.confirm", IpDemandStatusConfirmError::class),
    IP_DEMAND_STATUS_ACCEPT("v1.error.ip.demand.status.accept", IpDemandStatusAcceptError::class),
    IP_DEMAND_STATUS_REJECT("v1.error.ip.demand.status.reject", IpDemandStatusRejectError::class),
    IP_DEMAND_SUCCESS("v1.error.ip.demand.success", IpDemandSuccessError::class),
    IP_DEMAND_FAILED("v1.error.ip.demand.failed", IpDemandFailedError::class);
}