package com.example.imageviewsbonus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {
    lateinit var button:Button
    lateinit var button2:Button
    lateinit var imageView:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageView = findViewById(R.id.imageView)
        button =findViewById(R.id.button)
        button2 =findViewById(R.id.button2)
        button.setOnClickListener { imageView.setImageResource(R.drawable.image1) }
        button2.setOnClickListener { imageView.setImageResource(R.drawable.image2) }
    }
}