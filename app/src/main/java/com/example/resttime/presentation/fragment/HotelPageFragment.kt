package com.example.resttime.presentation.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.resttime.databinding.PageHotelFragmentBinding
import com.example.resttime.presentation.HotelPageViewModel
import com.example.resttime.util.BindingFragment
import org.koin.androidx.viewmodel.ext.android.viewModel

class HotelPageFragment:BindingFragment<PageHotelFragmentBinding>() {
    val viewModel by viewModel<HotelPageViewModel>()
    override fun createBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): PageHotelFragmentBinding {
        return PageHotelFragmentBinding.inflate(inflater, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.getHotel()

    }
}