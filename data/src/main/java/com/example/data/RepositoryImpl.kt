package com.example.data
import com.example.data.dto.GetHotel
import com.example.data.dto.models.AboutTheHotelDto
import com.example.data.dto.models.HotelDto
import com.example.domain.AboutTheHotel
import com.example.domain.Hotel
import com.example.domain.Repository
import com.example.domain.util.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class RepositoryImpl(val networkClient: NetworkClient):Repository {
    override suspend fun getHotel(): Flow<Resource<Hotel>> = flow{
        val response = networkClient.getHotel(GetHotel)
        when (response.resultCode) {
            ERROR -> {
                emit(Resource.Error("Check"))
            }
            SUCCESS -> {
                with(response) {
                    val hotel =  mapHotelFromDto(response.resultHotel!!)
                    emit(Resource.Success(hotel))
                }
            }
            else -> {
                emit(Resource.Error("Ошибка Сервера"))
            }
        }
    }
    private fun mapHotelFromDto(hotelDto: HotelDto):Hotel{
        return Hotel(
            mapAboutHotel(hotelDto.about_the_hotel),
            hotelDto.adress,
            hotelDto.id,
            hotelDto.image_urls,
            hotelDto.minimal_price,
            hotelDto.name,
            hotelDto.price_for_it,
            hotelDto.rating,
            hotelDto.rating_name
        )
    }
    private fun mapAboutHotel(aboutTheHotelDto: AboutTheHotelDto): AboutTheHotel {
        return AboutTheHotel(
            aboutTheHotelDto.description,
            aboutTheHotelDto.peculiarities
        )
    }
    companion object {
        const val ERROR = -1
        const val SUCCESS = 200
    }
}