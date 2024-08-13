package com.example.vehicleapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)



        val imageView = findViewById<ImageView>(R.id.imageView098)
        imageView.setOnClickListener {
            // Intent to navigate to DetailActivity
            val intent = Intent(this, DetailActivity::class.java)
            startActivity(intent)
        }

        val imageView1 = findViewById<ImageView>(R.id.imageView)
        imageView1.setOnClickListener {
            // Intent to navigate to DetailActivity
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)

        bottomNavigationView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.navigation_home -> {
                    // Stay in MainActivity
                    true
                }
                R.id.navigation_profile -> {
                    val intent = Intent(this, ProfileActivity::class.java)
                    startActivity(intent)
                    true
                }
                else -> false
            }
        }
    }
}
