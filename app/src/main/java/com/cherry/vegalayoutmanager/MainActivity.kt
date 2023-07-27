package com.cherry.vegalayoutmanager

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.cherry.vega.library.VegaLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var mHorizontalAdapter: HorizontalAdapter? = null
    var mVerticalAdapter: VerticalAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initialize()
        initData()
    }

    fun initialize () {
        mRvHorizontal.layoutManager = VegaLayoutManager(VegaLayoutManager.HORIZONTAL)
        mHorizontalAdapter = HorizontalAdapter(this)
        mRvHorizontal.adapter = mHorizontalAdapter

        mRvVertical.layoutManager = VegaLayoutManager(VegaLayoutManager.VERTICAL)
        mVerticalAdapter = VerticalAdapter(this)
        mRvVertical.adapter = mVerticalAdapter
    }

    fun initData () {
        mHorizontalAdapter?.datas?.clear()
        mVerticalAdapter?.datas?.clear()

        var datas = ArrayList<StockEntity>()
        datas.add(StockEntity("Google Inc.", 921.59f, 1, "+6.59 (+0.72%)"))
        datas.add(StockEntity("Apple Inc.", 158.73f, 1, "+0.06 (+0.04%)"))
        datas.add(StockEntity("Vmware Inc.", 109.74f, -1, "-0.24 (-0.22%)"))
        datas.add(StockEntity("Microsoft Inc.", 75.44f, 1, "+0.28 (+0.37%)"))
        datas.add(StockEntity("Facebook Inc.", 172.52f, 1, "+2.51 (+1.48%)"))
        datas.add(StockEntity("IBM Inc.", 144.40f, -1, "-0.15 (-0.10%)"))
        datas.add(StockEntity("Alibaba Inc.", 180.04f, 1, "+0.06 (+0.03%)"))
        datas.add(StockEntity("Tencent Inc.", 346.400f, 1, "+2.200 (+0.64%)"))
        datas.add(StockEntity("Baidu Inc.", 237.92f, -1, "-1.15 (-0.48%)"))
        datas.add(StockEntity("Amazon Inc.", 969.47f, -1, "-4.72 (-0.48%)"))
        datas.add(StockEntity("Oracle Inc.", 48.03f, -1, "-0.30 (-0.62%)"))
        datas.add(StockEntity("Intel Inc.", 37.22f, 1, "+0.22 (+0.61%)"))
        datas.add(StockEntity("Cisco Systems Inc.", 32.49f, -1, "-0.03 (-0.08%)"))
        datas.add(StockEntity("Qualcomm Inc.", 52.30f, 1, "+0.05 (+0.10%)"))
        datas.add(StockEntity("Sony Inc.", 37.65f, -1, "-0.74 (-1.93%)"))

        mHorizontalAdapter?.datas?.addAll(datas)
        mVerticalAdapter?.datas?.addAll(datas)

        mHorizontalAdapter?.notifyDataSetChanged()
        mVerticalAdapter?.notifyDataSetChanged()
    }
}