package com.ajcoding.fincord.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Record(
    @PrimaryKey
    private val recordId: Int,
    private val category: String,
    private val name: String,
    private val amount: String,
    private val date: String,
    private val periodic: String,
    private val note: String,
    private val cashFlowId: Int
)
