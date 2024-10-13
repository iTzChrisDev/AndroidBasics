package com.example.all_in_one.activities

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.all_in_one.R
import com.google.android.material.button.MaterialButton
import kotlin.random.Random

private lateinit var button: MaterialButton
private lateinit var view: ConstraintLayout

class ColorChanger : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_color_changer)
        initComponents()
        initEvents()
    }

    private fun initComponents() {
        button = findViewById(R.id.btn_color_changer_app)
        view = findViewById(R.id.color_changer_bg)
    }

    private fun initEvents() {
        button.setOnClickListener {
            view.setBackgroundColor(getRandomColor())
        }
    }

    private fun getRandomColor(): Int {
        val red = Random.nextInt(256)
        val green = Random.nextInt(256)
        val blue = Random.nextInt(256)
        return android.graphics.Color.rgb(red, green, blue)
    }
}
