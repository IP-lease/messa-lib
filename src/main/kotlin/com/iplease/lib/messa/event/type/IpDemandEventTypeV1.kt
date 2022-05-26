package com.iplease.lib.messa.event.type

import com.iplease.lib.messa.event.data.EventData
import com.iplease.lib.messa.event.data.ip.demand.IpDemandCreateEvent
import com.iplease.lib.messa.event.data.ip.demand.IpDemandFailedEvent
import com.iplease.lib.messa.event.data.ip.demand.IpDemandSuccessEvent
import com.iplease.lib.messa.event.data.ip.demand.info.IpDemandInfoUpdateEvent
import com.iplease.lib.messa.event.data.ip.demand.status.IpDemandStatusAcceptEvent
import com.iplease.lib.messa.event.data.ip.demand.status.IpDemandStatusConfirmEvent
import com.iplease.lib.messa.event.data.ip.demand.status.IpDemandStatusRejectEvent
import kotlin.reflect.KClass

@Suppress("unused")
enum class IpDemandEventTypeV1(
    private val routingKey: String,
    private val eventPayloadType: KClass<out EventData>
): EventType {
    IP_DEMAND_INFO_UPDATE("v1.event.ip.demand.info.update", IpDemandInfoUpdateEvent::class),
    IP_DEMAND_CREATE("v1.event.ip.demand.create", IpDemandCreateEvent::class),
    IP_DEMAND_STATUS_CONFIRM("v1.event.ip.demand.status.confirm", IpDemandStatusConfirmEvent::class),
    IP_DEMAND_STATUS_ACCEPT("v1.event.ip.demand.status.accept", IpDemandStatusAcceptEvent::class),
    IP_DEMAND_STATUS_REJECT("v1.event.ip.demand.status.reject", IpDemandStatusRejectEvent::class),
    IP_DEMAND_SUCCESS("v1.event.ip.demand.success", IpDemandSuccessEvent::class),
    IP_DEMAND_FAILED("v1.event.ip.demand.failed", IpDemandFailedEvent::class);

    override fun getRoutingKey(): String = routingKey
    override fun getPayloadType(): KClass<out EventData> = eventPayloadType
}