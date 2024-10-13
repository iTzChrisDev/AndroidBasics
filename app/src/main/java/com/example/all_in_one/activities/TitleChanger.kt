package com.example.all_in_one.activities

import android.os.Build
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.example.all_in_one.R
import com.google.android.material.appbar.MaterialToolbar
import com.google.android.material.button.MaterialButton

class TitleChanger : AppCompatActivity() {
    private var words: List<String> = emptyList()
    private var lastText: String? = null
    private lateinit var button: MaterialButton
    private lateinit var toolbar: MaterialToolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_title_changer)
        toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            val window = window
            window.statusBarColor = ContextCompat.getColor(this, R.color.green)
        }
        initComponents()
        initEvents()
    }
    private fun initComponents(){
        words = listOf(
            "Hola Mundo!",
            "Hello World!",
            "Bonjour Monde!",
            "Hallo Welt!",
            "Ciao Mondo!",
            "Olá Mundo!",
            "Привет мир!"
        )
        button = findViewById(R.id.btn_title_changer)
    }

    private fun initEvents(){
        button.setOnClickListener {
            var newText: String
            do {
                newText = words.random()
            } while (newText == lastText)
            lastText = newText
            toolbar.title = newText
        }
    }
}