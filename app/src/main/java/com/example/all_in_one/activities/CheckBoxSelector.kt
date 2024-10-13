package com.example.all_in_one.activities

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.all_in_one.R
import com.google.android.material.button.MaterialButton
import com.google.android.material.checkbox.MaterialCheckBox
import com.google.android.material.textview.MaterialTextView

class CheckBoxSelector : AppCompatActivity() {

    private lateinit var txtPizzaOrder: MaterialTextView
    private lateinit var btnShowOrder: MaterialButton
    private lateinit var pepperoni: MaterialCheckBox
    private lateinit var meat: MaterialCheckBox
    private lateinit var pineapple: MaterialCheckBox
    private lateinit var cheese: MaterialCheckBox
    private lateinit var toppings: MutableList<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_check_box_selector)
        initComponents()
        initEvents()
    }

    private fun initComponents() {
        txtPizzaOrder = findViewById(R.id.txt_display_toppings)
        btnShowOrder = findViewById(R.id.btn_show_order)
        pepperoni = findViewById(R.id.pepperoni)
        meat = findViewById(R.id.meat)
        pineapple = findViewById(R.id.pineapple)
        cheese = findViewById(R.id.cheese)
        toppings = mutableListOf()
    }

    private fun initEvents() {
        btnShowOrder.setOnClickListener {
            updateToppings()
        }
    }

    private fun updateToppings() {
        toppings.clear()
        if (pepperoni.isChecked) toppings.add("Pepperoni")
        if (meat.isChecked) toppings.add("Meat")
        if (pineapple.isChecked) toppings.add("Pineapple")
        if (cheese.isChecked) toppings.add("Cheese")

        var txt = ""
        if (toppings.isEmpty()) {
            txt = "No toppings :("
        } else {
            for (topping in toppings) {
                txt += "-$topping\n";
            }
        }
        txtPizzaOrder.text = txt
    }
}