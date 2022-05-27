package com.iplease.lib.messa.v2.data.event.subnet

import com.iplease.lib.messa.event.data.EventData
import com.iplease.lib.messa.v2.data.dto.SubnetDto

data class SubnetCreateEvent (
    val subnet: SubnetDto,
    val teacherId: Long
): EventData