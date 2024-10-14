package com.example.all_in_one.activities

import android.os.Bundle
import android.widget.RadioGroup
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.all_in_one.R
import com.google.android.material.button.MaterialButton
import com.google.android.material.radiobutton.MaterialRadioButton
import com.google.android.material.textview.MaterialTextView

class RadioSelector : AppCompatActivity() {
    private lateinit var btnShowMethod: MaterialButton
    private lateinit var txtPayment: MaterialTextView
    private lateinit var radioGroup: RadioGroup
    private lateinit var selectedRadioButton: MaterialRadioButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_radio_selector)
        initComponents()
        initEvents()
    }

    private fun initComponents() {
        btnShowMethod = findViewById(R.id.btn_show_method)
        txtPayment = findViewById(R.id.txt_display_method)
        radioGroup = findViewById(R.id.radioGroup)
    }

    private fun initEvents() {
        btnShowMethod.setOnClickListener {
            val selectedRadioButtonId = radioGroup.checkedRadioButtonId
            if (selectedRadioButtonId != -1) {
                selectedRadioButton = findViewById(selectedRadioButtonId)
                txtPayment.text = selectedRadioButton.text.toString()
            } else {
                txtPayment.text = "No method selected :("
            }
        }
    }
}