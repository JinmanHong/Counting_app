package com.example.people_counting_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClickme = findViewById<Button>(R.id.MyButton)
        val MyTextview = findViewById<TextView>(R.id.tv_Counting)
        var timesClicked = 0
        btnClickme.setOnClickListener {
            timesClicked += 1

            MyTextview.text = timesClicked.toString()
            Toast.makeText(this, "You click me!",Toast.LENGTH_LONG).show()
        }

        }

    }
