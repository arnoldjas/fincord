package com.ajcoding.fincord.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class CashFlow(
    @PrimaryKey
    val cashFlowId: Int,
    val balance: String,
    val accountName: String
)
