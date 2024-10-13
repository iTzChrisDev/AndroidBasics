package com.example.all_in_one.activities

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.all_in_one.R
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textview.MaterialTextView

class InputDisplay : AppCompatActivity() {
    private lateinit var txtInput:TextInputEditText
    private lateinit var btnInput:MaterialButton
    private lateinit var txtShow:MaterialTextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_input_display)
        initComponents()
        initEvents()
    }

    private fun initComponents(){
        txtInput = findViewById(R.id.input_text_display)
        btnInput = findViewById(R.id.btn_input_display)
        txtShow = findViewById(R.id.txt_display)
    }
    private fun initEvents(){
        btnInput.setOnClickListener {
            txtShow.text = txtInput.text.toString()
        }
    }

}