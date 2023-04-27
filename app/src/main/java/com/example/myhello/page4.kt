package com.example.myhello

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class page4 : AppCompatActivity() {
    lateinit var tvAlmost: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page4)
        tvAlmost = findViewById(R.id.tvAlmost)
        tvAlmost.setOnClickListener {
            val intent = Intent(this, page5::class.java)
            startActivity(intent)
        }
    }
}