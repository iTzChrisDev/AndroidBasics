package com.example.all_in_one

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import com.example.all_in_one.activities.ActivityLauncher
import com.example.all_in_one.activities.CheckBoxSelector
import com.example.all_in_one.activities.ColorChanger
import com.example.all_in_one.activities.ComponentLayout
import com.example.all_in_one.activities.CounterApp
import com.example.all_in_one.activities.InputDisplay
import com.example.all_in_one.activities.ScrollContent
import com.example.all_in_one.activities.SliderValue
import com.example.all_in_one.activities.TextSwitch
import com.example.all_in_one.activities.ToastMaker
import com.example.all_in_one.activities.WebOpener
import com.example.all_in_one.activities.ImageSwitcher
import com.example.all_in_one.activities.RadioSelector
import com.example.all_in_one.activities.TitleChanger
import com.google.android.material.button.MaterialButton

private lateinit var btnTextSwitch: MaterialButton
private lateinit var btnInputDisplay: MaterialButton
private lateinit var btnColorChanger: MaterialButton
private lateinit var btnToastMaker: MaterialButton
private lateinit var btnComponentLayout: MaterialButton
private lateinit var btnScrollComponent: MaterialButton
private lateinit var btnImageSwitcher: MaterialButton
private lateinit var btnCheckboxSelector: MaterialButton
private lateinit var btnRadioSelector: MaterialButton
private lateinit var btnSliderValue: MaterialButton
private lateinit var btnActivityLauncher: MaterialButton
private lateinit var btnWebOpener: MaterialButton
private lateinit var btnCounter: MaterialButton
private lateinit var btnDelayedText: MaterialButton
private lateinit var btnTextToggle: MaterialButton
private lateinit var btnSnackbarNotifier: MaterialButton
private lateinit var btnTitleChanger: MaterialButton
private lateinit var btnPasswordViewer: MaterialButton
private lateinit var btnKeyboardHider: MaterialButton

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        initComponents()
        initEvents()
    }

    private fun initComponents() {
        btnTextSwitch = findViewById(R.id.btn_text_switch)
        btnInputDisplay = findViewById(R.id.btn_input_display)
        btnColorChanger = findViewById(R.id.btn_color_changer)
        btnToastMaker = findViewById(R.id.btn_toast_maker)
        btnComponentLayout = findViewById(R.id.btn_component_layout)
        btnScrollComponent = findViewById(R.id.btn_scroll_component)
        btnImageSwitcher = findViewById(R.id.btn_image_switcher)
        btnCheckboxSelector = findViewById(R.id.btn_checkbox_selector)
        btnRadioSelector = findViewById(R.id.btn_radio_selector)
        btnSliderValue = findViewById(R.id.btn_slider_value)
        btnActivityLauncher = findViewById(R.id.btn_activity_launcher)
        btnWebOpener = findViewById(R.id.btn_web_opener)
        btnCounter = findViewById(R.id.btn_counter)
        btnDelayedText = findViewById(R.id.btn_delayed_text)
        btnTextToggle = findViewById(R.id.btn_text_toogle)
        btnSnackbarNotifier = findViewById(R.id.btn_snackbar_notifier)
        btnTitleChanger = findViewById(R.id.btn_title_changer)
        btnPasswordViewer = findViewById(R.id.btn_password_viewer)
        btnKeyboardHider = findViewById(R.id.btn_keyboard_hider)
    }

    private fun initEvents() {
        btnTextSwitch.setOnClickListener {
            startActivity(Intent(this, TextSwitch::class.java))
        }
        btnColorChanger.setOnClickListener {
            startActivity(Intent(this, ColorChanger::class.java))
        }
        btnInputDisplay.setOnClickListener {
            startActivity(Intent(this, InputDisplay::class.java))
        }
        btnToastMaker.setOnClickListener {
            startActivity(Intent(this, ToastMaker::class.java))
        }
        btnActivityLauncher.setOnClickListener {
            startActivity(Intent(this, ActivityLauncher::class.java))
        }
        btnWebOpener.setOnClickListener {
            startActivity(Intent(this, WebOpener::class.java))
        }
        btnComponentLayout.setOnClickListener {
            startActivity(Intent(this, ComponentLayout::class.java))
        }
        btnScrollComponent.setOnClickListener {
            startActivity(Intent(this, ScrollContent::class.java))
        }
        btnSliderValue.setOnClickListener {
            startActivity(Intent(this, SliderValue::class.java))
        }
        btnImageSwitcher.setOnClickListener {
            startActivity(Intent(this, ImageSwitcher::class.java))
        }
        btnTitleChanger.setOnClickListener {
            startActivity(Intent(this, TitleChanger::class.java))
        }
        btnCheckboxSelector.setOnClickListener {
            startActivity(Intent(this, CheckBoxSelector::class.java))
        }
        btnRadioSelector.setOnClickListener {
            startActivity(Intent(this, RadioSelector::class.java))
        }
        btnCounter.setOnClickListener {
            startActivity(Intent(this, CounterApp::class.java))
        }
    }
}