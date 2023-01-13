package com.example.kotlinproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class KotlinActivity : AppCompatActivity() {
    private lateinit var visszaGomb: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin)
        init()
        addListeners()
    }

    private fun addListeners() {
        visszaGomb.setOnClickListener {
            val intent = Intent(this@KotlinActivity, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

    fun init() {
        visszaGomb = findViewById(R.id.visszaGomb)
    }
}