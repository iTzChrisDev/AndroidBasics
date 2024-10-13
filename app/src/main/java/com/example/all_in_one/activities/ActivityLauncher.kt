package com.example.all_in_one.activities

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.all_in_one.MainActivity
import com.example.all_in_one.R
import com.google.android.material.button.MaterialButton

private lateinit var btnReturn : MaterialButton

class ActivityLauncher : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_launcher)
        btnReturn = findViewById(R.id.btn_return)
        btnReturn.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}