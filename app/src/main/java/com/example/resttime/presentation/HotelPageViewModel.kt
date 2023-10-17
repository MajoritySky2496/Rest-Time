package com.example.resttime.presentation

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.domain.Hotel
import com.example.domain.Interactor
import kotlinx.coroutines.launch

class HotelPageViewModel(val interactor: Interactor):ViewModel() {
    fun getHotel(){
        viewModelScope.launch {
            interactor.getHotel()
                .collect{ results ->
                    var hotel:Hotel? = null
                    if(results.data!=null){
                        hotel = results.data
                    }
                    when {
                        results.message != null -> {
                            Log.d("myLog", results.message.toString())
                        }
                        hotel==null -> {
                            Log.d("myLog", "Пустой список")
                        }
                    }
                }

        }
    }
}