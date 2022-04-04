package com.ajcoding.fincord

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber

@HiltAndroidApp
class FincordApp : Application() {
    override fun onCreate() {
        super.onCreate()

        //add timber logging library to debug build variant only
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
    }
}