package com.example.resttime.util

import android.app.Application
import com.example.resttime.di.dataModule
import com.example.resttime.di.interactorModule
import com.example.resttime.di.repositoryModule
import com.example.resttime.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App:Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
            modules(dataModule, repositoryModule, interactorModule, viewModelModule)
        }
    }
}