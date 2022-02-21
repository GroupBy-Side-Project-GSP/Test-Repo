package com.gsp.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(applicationContext, "수정입니다!", Toast.LENGTH_SHORT).show()
        Toast.makeText(applicationContext, "sample2", Toast.LENGTH_SHORT).show()
    }
}