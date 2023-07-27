package com.cherry.vegalayoutmanager

import android.content.Context
import android.graphics.Color
import android.graphics.drawable.Drawable
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.rv_vertical_cell.view.*

/*
 * -----------------------------------------------------------------
 * Copyright (C) 2018-2028, by Victor, All rights reserved.
 * -----------------------------------------------------------------
 * File: VerticalContentHolder
 * Author: Victor
 * Date: 2023/07/26 19:19
 * Description: 
 * -----------------------------------------------------------------
 */

class VerticalContentHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    fun bindData(data: StockEntity) {
        itemView.mTvName.text = data.name
        itemView.mTvCurrentPrice.text = "$${data.price}"
        itemView.mTvGross.text = data.gross
        if (data.flag > 0) {
            itemView.mTvGross.setTextColor(Color.RED)
            setTvDrawableRight(itemView.context,itemView.mTvGross,R.mipmap.up_red)
        } else {
            itemView.mTvGross.setTextColor(Color.GREEN)
            setTvDrawableRight(itemView.context,itemView.mTvGross,R.mipmap.down_green)
        }
    }

    fun setTvDrawableRight(
        context: Context?,
        textView: TextView?,
        icResId: Int
    ) {
        var drawable: Drawable? = null
        if (icResId != 0) {
            drawable = context?.resources?.getDrawable(icResId)
        }
        drawable?.setBounds(0, 0, drawable.minimumWidth, drawable.minimumHeight)


        var drawables = textView?.compoundDrawables
        if (drawables != null && drawables.size >= 4) {
            drawables[2] = drawable
            textView?.setCompoundDrawables(drawables[0],drawables[1],drawables[2],drawables[3])
        } else {
            textView?.setCompoundDrawables(null,null,drawable,null)
        }
    }
}