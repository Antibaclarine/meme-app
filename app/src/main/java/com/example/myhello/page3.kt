package com.example.myhello

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class page3 : AppCompatActivity() {
    lateinit var tvThere: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page3)
        tvThere = findViewById(R.id.tvThere)
        tvThere.setOnClickListener {
            val intent = Intent(this, page4::class.java)
            startActivity(intent)
        }
    }
}