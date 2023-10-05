package com.example.resttime.di

import com.example.domain.Interactor
import com.example.domain.impl.InteractorImpl
import org.koin.dsl.module

val interactorModule = module {
    single<Interactor> {InteractorImpl(get())}
}