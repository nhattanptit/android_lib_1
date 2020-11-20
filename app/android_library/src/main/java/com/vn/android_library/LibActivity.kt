package com.vn.android_library

import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LibActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        setSupportActionBar(findViewById(R.id.toolbar))
//        val floatingActionButton = findViewById<TextView>(R.id.fab)
//        floatingActionButton.setOnClickListener {
//            Toast.makeText(this, "LOG", Toast.LENGTH_LONG)
//        }
    }
}