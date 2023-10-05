package com.example.resttime.presentation.viewholder

import android.view.View
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.resttime.R
import com.example.resttime.presentation.models.ImageItem

class ImageViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {

    var imageView:ImageView = itemView.findViewById(R.id.image_slider)

    fun bind(item:ImageItem){
        Glide.with(itemView).load(item.hotel.image_urls)
            .centerCrop()
            .into(imageView)
    }


}