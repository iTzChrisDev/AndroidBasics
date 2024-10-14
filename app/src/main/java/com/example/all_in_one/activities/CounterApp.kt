package com.example.all_in_one.activities

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatImageButton
import com.example.all_in_one.R

class CounterApp : AppCompatActivity() {

    private lateinit var counter: TextView
    private lateinit var btnPlus: AppCompatImageButton
    private lateinit var btnMinus: AppCompatImageButton
    private var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_counter_app)
        initComponents()
        initEvents()
    }

    private fun initComponents() {
        counter = findViewById(R.id.counter)
        btnPlus = findViewById(R.id.btn_plus)
        btnMinus = findViewById(R.id.btn_minus)
    }

    private fun initEvents() {
        btnPlus.setOnClickListener {
            count++
            counter.text = count.toString()
        }
        btnMinus.setOnClickListener {
            count--
            counter.text = count.toString()
        }
    }
}