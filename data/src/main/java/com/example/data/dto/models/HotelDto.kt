package com.example.data.dto.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class HotelDto(
    val about_the_hotel: AboutTheHotelDto,
    val adress: String,
    val id: Int,
    val image_urls: List<String>,
    val minimal_price: Int,
    val name: String,
    val price_for_it: String,
    val rating: Int,
    val rating_name: String
) : Parcelable

@Parcelize
data class AboutTheHotelDto(
    val description: String,
    val peculiarities: List<String>
) : Parcelable
