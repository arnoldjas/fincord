package com.ajcoding.fincord.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.ajcoding.fincord.data.model.Account
import com.ajcoding.fincord.data.model.CashFlow
import com.ajcoding.fincord.data.model.Record

@Database(
    entities = [Account::class, CashFlow::class, Record::class],
    version = 1
)
abstract class FincordDatabase: RoomDatabase() {

    abstract val fincordDao: FincordDao

}