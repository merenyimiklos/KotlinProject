package com.example.kotlinproject

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class KotlinActivity : AppCompatActivity() {
    private lateinit var visszaGomb: Button
    private lateinit var kuldesGomb: Button
    private lateinit var nevInput: EditText
    private lateinit var koszontoSzoveg: TextView

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
        kuldesGomb.setOnClickListener {
            val nev = nevInput.text
            koszontoSzoveg.text = "Hello $nev"
            val color = when (nev.length) {
                in 0..10 -> Color.RED
                in 11..20 -> Color.GREEN
                in 21..30 -> Color.BLUE
                else -> Color.BLACK
            }
            koszontoSzoveg.setTextColor(color)
        }
    }

    fun init() {
        visszaGomb = findViewById(R.id.visszaGomb)
        kuldesGomb = findViewById(R.id.kuldesGomb)
        nevInput = findViewById(R.id.nevInput)
        koszontoSzoveg = findViewById(R.id.koszontoSzoveg)
    }
}