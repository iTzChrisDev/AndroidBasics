package com.example.all_in_one.activities

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.all_in_one.R
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textview.MaterialTextView

class DelayedText : AppCompatActivity() {
    private lateinit var txtInput: TextInputEditText
    private lateinit var btnInput: MaterialButton
    private lateinit var txtShow: MaterialTextView
    private val handler = Handler(Looper.getMainLooper())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_delayed_text)
        initComponents()
        initEvents()
    }

    private fun initComponents() {
        txtInput = findViewById(R.id.input_text_display_delay)
        btnInput = findViewById(R.id.btn_input_display_delay)
        txtShow = findViewById(R.id.txt_display_delay)
    }

    private fun initEvents() {
        btnInput.setOnClickListener {
            handler.postDelayed({
                txtShow.text = txtInput.text.toString()
            }, 3000)
        }
    }
}