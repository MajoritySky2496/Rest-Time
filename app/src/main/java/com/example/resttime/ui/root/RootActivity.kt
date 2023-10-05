package com.example.resttime.ui.root

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.resttime.databinding.ActivityRootBinding
import com.example.resttime.presentation.HotelPageViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class RootActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRootBinding
    private val viewModel by viewModel<HotelPageViewModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRootBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewModel.getHotel()

    }
}