package com.hiczp.bilibili.lotteryListener.model

import com.hiczp.bilibili.api.live.socket.entity.DataEntity
import com.hiczp.bilibili.lotteryListener.event.EventType

data class PushModel<T : DataEntity>(
        val roomId: Long,
        val realRoomId: Long,
        val eventType: EventType,
        val payload: T
)
