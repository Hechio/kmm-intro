package com.stevehechio.apps.kmmtest.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.stevehechio.apps.kmmtest.Greeting
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private val greeting = Greeting()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv: TextView = findViewById(R.id.text_view)
        tv.text = "Loading..."



    }
}
