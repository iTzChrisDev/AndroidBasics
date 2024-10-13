package com.example.all_in_one.activities

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.all_in_one.R
import com.google.android.material.button.MaterialButton

private lateinit var btn_toast : MaterialButton

class ToastMaker : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_toast_maker)
        btn_toast = findViewById(R.id.btn_toast)
        btn_toast.setOnClickListener {
            Toast.makeText(this, "This is a toast message", Toast.LENGTH_SHORT).show()
        }
    }
}