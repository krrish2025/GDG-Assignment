package com.example.assignment_gdg

import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bumptech.glide.Glide

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main3)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val profile = findViewById<ImageView>(R.id.profile)

        Glide.with(this)
            .load(R.drawable.person_circle)
            .into(profile)

        val fb = findViewById<ImageView>(R.id.facebook)

        Glide.with(this)
            .load(R.drawable._023_facebook_icon)
            .into(fb)

        val tw = findViewById<ImageView>(R.id.twitter)

        Glide.with(this)
            .load(R.drawable.twitter_03)
            .into(tw)
    }
}