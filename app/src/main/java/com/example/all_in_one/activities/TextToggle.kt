package com.example.all_in_one.activities

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.all_in_one.R
import com.google.android.material.button.MaterialButton

class TextToggle : AppCompatActivity() {
    private lateinit var button: MaterialButton
    private lateinit var txt: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_text_toggle)
        initComponents()
        initEvents()
    }

    private fun initComponents() {
        button = findViewById(R.id.btn_toggle)
        txt = findViewById(R.id.txt_visible)
    }

    private fun initEvents() {
        button.setOnClickListener {
            if (txt.visibility == TextView.VISIBLE) {
                txt.visibility = TextView.INVISIBLE
            } else {
                txt.visibility = TextView.VISIBLE
            }
        }
    }
}