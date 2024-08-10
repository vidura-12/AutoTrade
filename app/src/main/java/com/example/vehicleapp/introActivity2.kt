package com.example.vehicleapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class introActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_intro2)

        val btn: Button = findViewById(R.id.start1)
        btn.setOnClickListener {
            // Create an Intent to start introActivity3
            val intent = Intent(this, introActivity3::class.java)
            startActivity(intent)
        }
    }
}
