package com.example.domain.impl

import com.example.domain.Hotel
import com.example.domain.Interactor
import com.example.domain.Repository
import com.example.domain.util.Resource
import com.example.domain.util.Results
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class InteractorImpl(val repository: Repository):Interactor {
    override suspend fun getHotel(): Flow<Results<Hotel?, String?>> {
        return repository.getHotel().map { result ->
            when(result){
                is Resource.Success -> {
                    Results(result.data, null)
                }
                is Resource.Error -> {
                    Results(null, result.message
                    )
                }
            }

        }
    }
}