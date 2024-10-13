package com.example.all_in_one.activities

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.all_in_one.R
import com.google.android.material.button.MaterialButton

private var words: List<String> = emptyList()
private lateinit var button: MaterialButton
private lateinit var txt: TextView
private var lastText: String? = null

class TextSwitch : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_text_switch)
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
        button = findViewById(R.id.btnChange)
        txt = findViewById(R.id.txtChange)
    }

    private fun initEvents(){
        button.setOnClickListener {
            var newText: String
            do {
                newText = words.random()
            } while (newText == lastText)
            lastText = newText
            txt.text = newText
        }
    }
}
