package com.example.resttime.presentation.adapter

import com.example.resttime.presentation.models.ListItem
import com.hannesdorfmann.adapterdelegates4.AbsDelegationAdapter

class Adapter(items:List<ListItem>):AbsDelegationAdapter<List<ListItem>>() {
    init {
        delegatesManager.addDelegate(ImageDelegateAdapter())
        setItems(items)
    }

    override fun getItemCount(): Int {
        return items!!.size
    }

}