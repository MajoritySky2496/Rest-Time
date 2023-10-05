package com.example.data

import com.example.data.dto.Responce

interface NetworkClient {
    suspend fun getHotel(dto:Any):Responce
}