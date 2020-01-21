package com.l3ios.customviewgroup

import android.content.Context
import android.util.AttributeSet
import android.widget.FrameLayout
import kotlinx.android.synthetic.main.view_item_data.view.*

class CustomViewGroupDetail : FrameLayout {

    constructor(context: Context) : super(context)
    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    )

    init {
        inflate(context, R.layout.view_item_data, this)
    }

    fun setTitle(text: String) {
        titleTextView?.text = text
    }

    fun setData(text: String){
        valueTextView?.text = text
    }
}