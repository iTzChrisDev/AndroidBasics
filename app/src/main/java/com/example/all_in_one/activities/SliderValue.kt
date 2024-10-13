package com.example.all_in_one.activities

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.all_in_one.R
import com.google.android.material.slider.Slider
import com.google.android.material.textview.MaterialTextView

class SliderValue : AppCompatActivity() {
    private lateinit var btnSliderValue: Slider
    private lateinit var txtSliderValue: MaterialTextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_slider_value)
        initComponents()
        initEvents()
    }

    private fun initComponents() {
        btnSliderValue = findViewById(R.id.btn_slider_value)
        txtSliderValue = findViewById(R.id.txt_slider_value)
    }

    private fun initEvents() {
        btnSliderValue.addOnChangeListener(Slider.OnChangeListener { slider, value, fromUser ->
            txtSliderValue.text = "Value: " + (value * 100).toInt().toString() + "%"
        })
    }
}