package com.ajcoding.fincord.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class CashFlow(
    @PrimaryKey
    private val cashFlowId: Int,
    private val income: List<Record>,
    private val expense: List<Record>,
    private val balance: String,
    private val accountName: String
)
