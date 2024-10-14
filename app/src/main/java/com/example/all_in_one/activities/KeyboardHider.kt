package com.example.all_in_one.activities

import android.os.Bundle
import android.view.inputmethod.InputMethodManager
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.all_in_one.R
import com.google.android.material.button.MaterialButton

class KeyboardHider : AppCompatActivity() {

    private lateinit var btn_toggle: MaterialButton
    private lateinit var editText: EditText
    private var isKeyboardVisible = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_keyboard_hider)

        btn_toggle = findViewById(R.id.btn_hide_keyboard)
        editText = findViewById(R.id.input_keyboard)

        btn_toggle.setOnClickListener {
            val imm = getSystemService(InputMethodManager::class.java)
            if (isKeyboardVisible) {
                imm.hideSoftInputFromWindow(editText.windowToken, 0)
                isKeyboardVisible = false
            } else {
                editText.requestFocus()
                imm.showSoftInput(editText, InputMethodManager.SHOW_IMPLICIT)
                isKeyboardVisible = true
            }
        }
    }
}
