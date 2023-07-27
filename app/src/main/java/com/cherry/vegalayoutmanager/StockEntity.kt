package com.cherry.vegalayoutmanager

/*
 * -----------------------------------------------------------------
 * Copyright (C) 2018-2028, by Victor, All rights reserved.
 * -----------------------------------------------------------------
 * File: StockEntity
 * Author: Victor
 * Date: 2023/07/27 14:05
 * Description: 
 * -----------------------------------------------------------------
 */

data class StockEntity(
    var name: String? = null,
    val price: Float = 0f,
    val flag: Int = 0,
    val gross: String? = null
)
