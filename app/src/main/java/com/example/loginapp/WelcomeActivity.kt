package com.example.loginapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class WelcomeActivity : AppCompatActivity() {

    private lateinit var tvWelcome: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        tvWelcome = findViewById(R.id.tvWelcome)

        val username = intent.getStringExtra("USERNAME") ?: "User"
        tvWelcome.text = "Welcome $username!"
    }
}
