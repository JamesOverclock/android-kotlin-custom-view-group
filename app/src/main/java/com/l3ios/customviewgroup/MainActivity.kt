package com.l3ios.customviewgroup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        customView1?.setTitle("Google")
        customView1?.setData("Android")

        customView2?.setTitle("Apple")
        customView2?.setData("iOS")

        customView3?.setTitle("Microsoft")
        customView3?.setData("Windows")
    }
}
