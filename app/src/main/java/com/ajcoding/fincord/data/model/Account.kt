package com.ajcoding.fincord.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Account(
    @PrimaryKey(autoGenerate = false)
    private val accountName: String,
    private val amount: List<CashFlow>
)
