package com.ygs.helloworld

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClickMe = findViewById<Button>(R.id.myButton)
        val myTextView = findViewById<TextView>(R.id.textView)
        var timesClicked = 0;

        btnClickMe.text = "증가"
        btnClickMe.setOnClickListener {
//            btnClickMe.text = "변신성공"
            timesClicked++
            myTextView.text = timesClicked.toString();

            Toast.makeText(this, "토스트입니다만?", Toast.LENGTH_LONG).show()
        }
    }
}