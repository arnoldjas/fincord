package com.ajcoding.fincord.di

import android.app.Application
import androidx.room.Room
import com.ajcoding.fincord.data.db.FincordDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideFincordDb(context: Application) : FincordDatabase {
        return Room.databaseBuilder(context, FincordDatabase::class.java, "fincord_db")
            .build()
    }

}