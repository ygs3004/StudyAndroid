package com.ygs.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private var textViewInput: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textViewInput = findViewById(R.id.textViewInput)
    }

    fun onDigit(view: View) {
        // Toast.makeText(this, "Button Clicked", Toast.LENGTH_SHORT).show()
        textViewInput?.append((view as Button).text)
    }

    fun onClear(view: View){
        textViewInput?.text = ""
    }
}