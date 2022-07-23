package com.example.protectearth

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SixthActivity  : AppCompatActivity() {
    private lateinit var data: Data
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sixth)

        val recognition = intent.getIntExtra("recognition", 0)
        val professional = intent.getIntExtra("professional", 0)
        val active = intent.getIntExtra("active", 0)
        val steady = intent.getIntExtra("steady", 0)
        data = Data(recognition, professional, active, steady)

        val btn1 = findViewById<Button>(R.id.button1)
        btn1.setOnClickListener {
            val intent = Intent(this, SeventhActivity::class.java)
            intent.putExtra("recognition", data.recognition)
            intent.putExtra("professional", data.professional)
            intent.putExtra("active", data.active)
            intent.putExtra("steady", data.steady)
            startActivity(intent)

        }
        val btn2 = findViewById<Button>(R.id.button2)
        btn2.setOnClickListener {
            val intent = Intent(this, SeventhActivity::class.java)
            data.professional += 1
            intent.putExtra("recognition", data.recognition)
            intent.putExtra("professional", data.professional)
            intent.putExtra("active", data.active)
            intent.putExtra("steady", data.steady)
            startActivity(intent)
        }
        val btn3 = findViewById<Button>(R.id.button3)
        btn3.setOnClickListener {
            val intent = Intent(this, SeventhActivity::class.java)
            data.active += 1
            intent.putExtra("recognition", data.recognition)
            intent.putExtra("professional", data.professional)
            intent.putExtra("active", data.active)
            intent.putExtra("steady", data.steady)
            startActivity(intent)
        }
    }
}