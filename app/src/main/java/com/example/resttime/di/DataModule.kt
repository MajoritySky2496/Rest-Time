package com.example.resttime.di

import com.example.data.NetworkClient
import com.example.data.network.Api
import com.example.data.network.RetrofitNetworkClient
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val dataModule = module {
    single<Api> {
        Retrofit.Builder()
            .baseUrl("https://run.mocky.io/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(Api::class.java)
    }
    single<NetworkClient> {RetrofitNetworkClient(get(), get())}
}