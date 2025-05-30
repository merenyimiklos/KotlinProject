package com.example.kotlinproject

import androidx.appcompat.app.AppCompatActivity
import android.widget.EditText
import android.widget.TextView
import android.os.Bundle
import com.example.kotlinproject.R
import android.content.Intent
import android.graphics.Color
import android.view.View
import android.widget.Button
import com.example.kotlinproject.MainActivity

class JavaToKotlinActivity : AppCompatActivity() {
    private var visszaGomb: Button? = null
    private var nevInput: EditText? = null
    private var kuldesGomb: Button? = null
    private var koszontoSzoveg: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_java_to_kotlin)
        init()
        addlisteners()
    }

    private fun addlisteners() {
        visszaGomb!!.setOnClickListener { view: View? ->
            val intent = Intent(this@JavaToKotlinActivity, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
        kuldesGomb!!.setOnClickListener { view: View? ->
            val nev = nevInput!!.text.toString()
            koszontoSzoveg!!.text = "Hello $nev"
            if (nev.length <= 10) {
                koszontoSzoveg!!.setTextColor(Color.RED)
            } else if (nev.length > 10 && nev.length <= 20) {
                koszontoSzoveg!!.setTextColor(Color.GREEN)
            } else if (nev.length > 20 && nev.length <= 30) {
                koszontoSzoveg!!.setTextColor(Color.BLUE)
            } else {
                koszontoSzoveg!!.setTextColor(Color.BLACK)
            }
        }
    }

    private fun init() {
        visszaGomb = findViewById(R.id.visszaGomb)
        nevInput = findViewById(R.id.nevInput)
        kuldesGomb = findViewById(R.id.kuldesGomb)
        koszontoSzoveg = findViewById(R.id.koszontoSzoveg)
    }
}