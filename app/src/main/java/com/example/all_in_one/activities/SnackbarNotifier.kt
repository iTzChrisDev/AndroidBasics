package com.example.all_in_one.activities

import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.res.ResourcesCompat
import com.google.android.material.snackbar.Snackbar
import com.example.all_in_one.R
import com.google.android.material.button.MaterialButton

class SnackbarNotifier : AppCompatActivity() {
    private lateinit var btn_snackbar: MaterialButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_snackbar_notifier)
        btn_snackbar = findViewById(R.id.btn_snackbar)
        btn_snackbar.setOnClickListener {
            val snackbar = Snackbar.make(it, "This is a snackbar", Snackbar.LENGTH_LONG)
            snackbar.setBackgroundTint(resources.getColor(R.color.green, theme))
            snackbar.setAction("UNDO") {
                Toast.makeText(this, "Closed snackbar", Toast.LENGTH_SHORT).show()
            }
            snackbar.setActionTextColor(Color.WHITE)
            snackbar.setTextColor(Color.WHITE)
            snackbar.view.setBackgroundColor(resources.getColor(R.color.green, theme))

            val snackbarTextView = snackbar.view.findViewById<TextView>(com.google.android.material.R.id.snackbar_text)
            val customFont: Typeface? = ResourcesCompat.getFont(this, R.font.montserrat_regular)
            val customFontBold: Typeface? = ResourcesCompat.getFont(this, R.font.montserrat_semibold)
            snackbarTextView.typeface = customFont

            val snackbarActionView = snackbar.view.findViewById<TextView>(com.google.android.material.R.id.snackbar_action)
            snackbarActionView.typeface = customFontBold

            snackbar.show()
        }
    }
}