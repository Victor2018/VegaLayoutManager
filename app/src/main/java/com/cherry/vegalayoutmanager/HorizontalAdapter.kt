package com.cherry.vegalayoutmanager

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

/*
 * -----------------------------------------------------------------
 * Copyright (C) 2018-2028, by Victor, All rights reserved.
 * -----------------------------------------------------------------
 * File: HorizontalAdapter
 * Author: Victor
 * Date: 2023/07/26 19:24
 * Description: 
 * -----------------------------------------------------------------
 */

class HorizontalAdapter(var context: Context): RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    var datas: ArrayList<StockEntity> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return HorizontalContentHolder(inflate(R.layout.rv_horizontal_cell,parent))
    }

    override fun getItemCount(): Int {
        return datas.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is HorizontalContentHolder) {
            holder.bindData(datas[position])
        }
    }

    fun inflate(layoutId: Int,parent: ViewGroup): View {
        var inflater = LayoutInflater.from(context)
        return inflater.inflate(layoutId,parent, false)
    }
}