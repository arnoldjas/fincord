package com.ajcoding.fincord.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Record(
    @PrimaryKey
    val recordId: Int,
    val category: String,
    val name: String,
    val amount: String,
    val date: String,
    val periodic: String,
    val note: String,
    val cashFlowId: Int
)
