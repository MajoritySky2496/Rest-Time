package com.example.resttime.presentation.models

import com.example.domain.Hotel

abstract class ListItem
data class ImageItem(val hotel: Hotel) : ListItem()