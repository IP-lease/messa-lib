package com.iplease.lib.messa.v2.data.event

import com.iplease.lib.messa.event.data.EventData
import com.iplease.lib.messa.v2.data.dto.SubnetDto

data class SubnetDeleteEvent (
    val subnet: SubnetDto,
    val teacherId: Long
): EventData