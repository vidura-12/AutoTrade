package com.example.vehicleapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.bottomnavigation.BottomNavigationView

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_profile)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)

        bottomNavigationView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.navigation_home -> {
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                    true
                }
                R.id.navigation_profile -> {
                    // Stay in ProfileActivity
                    true
                }
                else -> false
            }
        }
        val btn: Button = findViewById(R.id.logout)
        btn.setOnClickListener {
            // Navigate to introActivity2 when the button is clicked
            val intent = Intent(this, Signin::class.java)
            startActivity(intent)
        }
        val btn1  = findViewById<ImageView>(R.id.imageView11)
        btn1.setOnClickListener {
            // Navigate to introActivity2 when the button is clicked
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
