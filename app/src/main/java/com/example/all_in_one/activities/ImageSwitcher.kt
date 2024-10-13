package com.example.all_in_one.activities

import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.PickVisualMediaRequest
import androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.example.all_in_one.R
import com.google.android.material.button.MaterialButton

class ImageSwitcher : AppCompatActivity() {
    private var images: List<String> = emptyList()
    private lateinit var btn_switcher: MaterialButton
    private lateinit var btn_select: MaterialButton
    private lateinit var image: ImageView
    private var lastImage: String? = null
    private val pick_media = registerForActivityResult(PickVisualMedia()){ uri ->
        if (uri != null){
            image.setImageURI(uri)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_image_switcher)
        initComponents()
        initEvents()
    }

    private fun initComponents() {
        images = listOf(
            "c",
            "cobol",
            "csharp",
            "css",
            "dart",
            "html5",
            "java",
            "javascript",
            "kotlin",
            "python",
            "swift"
        )
        btn_switcher = findViewById(R.id.btn_image_switcher)
        btn_select = findViewById(R.id.btn_select_image_switcher)
        image = findViewById(R.id.image_display_switcher)
    }

    private fun initEvents() {
        btn_switcher.setOnClickListener {
            var newImage: String
            do {
                newImage = images.random()
            } while (newImage == lastImage)
            lastImage = newImage
            val resId = resources.getIdentifier(newImage, "drawable", packageName)
            if (resId != 0) {
                image.setImageDrawable(ContextCompat.getDrawable(this, resId))
            }
        }
        btn_select.setOnClickListener {
            pick_media.launch(PickVisualMediaRequest(PickVisualMedia.ImageOnly))
        }
    }
}