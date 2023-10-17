package com.example.resttime.di

import com.example.resttime.presentation.HotelPageViewModel
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.dsl.module

val viewModelModule = module {
    viewModelOf(::HotelPageViewModel)
}