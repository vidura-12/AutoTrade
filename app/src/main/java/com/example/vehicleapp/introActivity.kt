package com.example.vehicleapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class introActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)

        // Find the button and set an OnClickListener
        val btn: Button = findViewById(R.id.start)
        btn.setOnClickListener {
            // Navigate to introActivity2 when the button is clicked
            val intent = Intent(this, introActivity2::class.java)
            startActivity(intent)
        }
    }
}
