package com.example.protectearth

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class FirstActivity  : AppCompatActivity() {
    private var data: Data = Data(0, 0, 0, 0)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.first)
        val btn1 = findViewById<Button>(R.id.button1)
        btn1.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            data.recognition += 1
            data.professional += 1
            intent.putExtra("recognition", data.recognition)
            intent.putExtra("professional", data.professional)
            intent.putExtra("active", data.active)
            intent.putExtra("steady", data.steady)
            startActivity(intent)

        }
        val btn2 = findViewById<Button>(R.id.button2)
        btn2.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            data.active += 1
            intent.putExtra("recognition", data.recognition)
            intent.putExtra("professional", data.professional)
            intent.putExtra("active", data.active)
            intent.putExtra("steady", data.steady)
            startActivity(intent)
        }
        val btn3 = findViewById<Button>(R.id.button3)
        btn3.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)

            data.steady += 1
            intent.putExtra("recognition", data.recognition)
            intent.putExtra("professional", data.professional)
            intent.putExtra("active", data.active)
            intent.putExtra("steady", data.steady)
            startActivity(intent)
        }
    }
}