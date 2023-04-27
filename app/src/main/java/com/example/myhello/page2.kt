package com.example.myhello

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class page2 : AppCompatActivity() {
    lateinit var tvGetgoing: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page2)
        tvGetgoing = findViewById(R.id.tvGetgoing)
        tvGetgoing.setOnClickListener {
            val intent = Intent(this, page3::class.java)
            startActivity(intent)
        }
    }
}