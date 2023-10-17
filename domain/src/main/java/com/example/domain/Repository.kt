package com.example.domain

import com.example.domain.util.Resource
import kotlinx.coroutines.flow.Flow


interface Repository {
    suspend fun getHotel(): Flow<Resource<Hotel>>
}