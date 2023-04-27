package com.example.myhello

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var tvgoing:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvgoing=findViewById(R.id.tvgoing)
        tvgoing.setOnClickListener {
            val intent=Intent(this,page2::class.java)
            startActivity(intent)
        }
    }
}