package com.example.assignment_gdg

import android.content.Intent
import android.widget.Button
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnProfile = findViewById<Button>(R.id.btnProfile2)

        btnProfile.setOnClickListener {
            val intent = Intent(this , MainActivity3::class.java)
            startActivity(intent)
        }

        val btnSU = findViewById<Button>(R.id.btnSignUp)

        btnSU.setOnClickListener {
            val intent = Intent(this , MainActivity::class.java)
            startActivity(intent)
        }
    }
}