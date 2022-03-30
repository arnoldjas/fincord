package com.ajcoding.fincord.data.model.relations

import androidx.room.Embedded
import androidx.room.Relation
import com.ajcoding.fincord.data.model.Account
import com.ajcoding.fincord.data.model.CashFlow

data class AccountWithCashFlows(
    @Embedded val account: Account,
    @Relation(
        parentColumn = "accountName",
        entityColumn = "accountName"
    )
    val cashFlows: List<CashFlow>
)
