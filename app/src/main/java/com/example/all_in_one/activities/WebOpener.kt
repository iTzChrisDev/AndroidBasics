package com.example.all_in_one.activities

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.all_in_one.R
import com.google.android.material.button.MaterialButton

class WebOpener : AppCompatActivity() {
    private lateinit var btn_google: MaterialButton
    private lateinit var btn_github: MaterialButton
    private lateinit var btn_youtube: MaterialButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_web_opener)
        initComponents()
        initEvents()
    }

    private fun initComponents() {
        btn_google = findViewById(R.id.btn_google)
        btn_github = findViewById(R.id.btn_github)
        btn_youtube = findViewById(R.id.btn_youtube)
    }
    private fun initEvents() {
        btn_google.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"))
            startActivity(intent)
        }
        btn_github.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com"))
            startActivity(intent)
        }
        btn_youtube.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com"))
            startActivity(intent)
        }
    }
}