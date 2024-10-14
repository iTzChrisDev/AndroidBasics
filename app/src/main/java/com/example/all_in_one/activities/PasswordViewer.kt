package com.example.all_in_one.activities

import android.os.Bundle
import android.text.method.PasswordTransformationMethod
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.all_in_one.R
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText

class PasswordViewer : AppCompatActivity() {

    private lateinit var inputPasswordViewer: TextInputEditText
    private lateinit var btnPasswordViewer: MaterialButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_password_viewer)
        initComponents()
        initEvents()
    }

    private fun initComponents() {
        inputPasswordViewer = findViewById(R.id.input_password_viewer)
        btnPasswordViewer = findViewById(R.id.btn_password_viewer)
    }

    private fun initEvents() {
        btnPasswordViewer.setOnClickListener {
            // Alterna entre mostrar y ocultar la contraseña
            if (inputPasswordViewer.transformationMethod is PasswordTransformationMethod) {
                // Cambiar a texto visible
                inputPasswordViewer.transformationMethod = null
                btnPasswordViewer.setIconResource(R.drawable.eye_on) // Cambia el icono a "visible"
            } else {
                // Cambiar a texto oculto
                inputPasswordViewer.transformationMethod = PasswordTransformationMethod()
                btnPasswordViewer.setIconResource(R.drawable.eye) // Cambia el icono a "oculto"
            }
            inputPasswordViewer.setSelection(inputPasswordViewer.length()) // Mantiene el cursor al final
        }
    }
}
