package com.ajcoding.fincord.data.db

import androidx.room.*
import com.ajcoding.fincord.data.model.Account
import com.ajcoding.fincord.data.model.CashFlow
import com.ajcoding.fincord.data.model.Record
import com.ajcoding.fincord.data.model.relations.AccountWithCashFlows
import com.ajcoding.fincord.data.model.relations.CashFlowWithRecords

@Dao
interface FincordDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAccount(account: Account)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertCashFLow(cashFlow: CashFlow)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertRecord(record: Record)

    @Transaction
    @Query("SELECT * FROM account WHERE accountName = :accountName")
    suspend fun getAccountWithCashFlows(accountName: String): List<AccountWithCashFlows>

    @Transaction
    @Query("SELECT * FROM cashflow WHERE cashFlowId = :cashFlowId")
    suspend fun getCashFlowWithRecords(cashFlowId: Int): List<CashFlowWithRecords>
}