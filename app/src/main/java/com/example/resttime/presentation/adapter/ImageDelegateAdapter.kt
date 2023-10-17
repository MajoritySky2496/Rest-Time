package com.example.resttime.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.resttime.R
import com.example.resttime.presentation.models.ImageItem
import com.example.resttime.presentation.models.ListItem
import com.example.resttime.presentation.viewholder.ImageViewHolder


//class ImageDelegateAdapter:AdapterDelegate<List<ListItem>>() {
//    override fun isForViewType(items: List<ListItem>, position: Int): Boolean {
//        return items[position] is ImageItem
//    }
//
//    override fun onCreateViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
//        return ImageViewHolder( LayoutInflater.from(parent.context).inflate(
//            R.layout.image_slider_viewitem, parent,
//            false
//        ))
//    }
//
//    override fun onBindViewHolder(
//        items: List<ListItem>,
//        position: Int,
//        holder: RecyclerView.ViewHolder,
//        payloads: MutableList<Any>
//    ) {
//        val imageItem = items[position] as ImageItem
//        val imageViewHolder = holder as ImageViewHolder
//        imageViewHolder.bind(imageItem)
//    }
//
//}