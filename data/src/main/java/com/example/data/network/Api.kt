package com.example.data.network

import com.example.data.dto.models.HotelDto
import retrofit2.http.GET

interface Api {
    @GET("/v3/35e0d18e-2521-4f1b-a575-f0fe366f66e3")
    suspend fun getHotel(): HotelDto
}