package com.ajcoding.fincord.data.model.relations

import androidx.room.Embedded
import androidx.room.Relation
import com.ajcoding.fincord.data.model.CashFlow
import com.ajcoding.fincord.data.model.Record

data class CashFlowWithRecords(
    @Embedded val cashFlow: CashFlow,
    @Relation(
        parentColumn = "cashFlowId",
        entityColumn = "cashFlowId"
    )
    val records: List<Record>
)
