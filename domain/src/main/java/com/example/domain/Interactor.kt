package com.example.domain

import com.example.domain.util.Results
import kotlinx.coroutines.flow.Flow

interface Interactor {
    suspend fun getHotel(): Flow<Results<Hotel?, String?>>
}