package com.myapp.uas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class detailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        supportActionBar?.apply {
            elevation = 0f
            title = ""
        }
    }
}