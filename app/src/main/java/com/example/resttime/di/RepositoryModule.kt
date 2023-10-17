package com.example.resttime.di

import com.example.data.RepositoryImpl
import com.example.domain.Repository
import org.koin.dsl.module

val repositoryModule = module {

    single<Repository> {RepositoryImpl(get())  }
}