package com.ygs.myquizapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnStart: Button = findViewById(R.id.btn_start)
        val etName: EditText = findViewById(R.id.et_name)
        btnStart.setOnClickListener {

            if(etName.text.isEmpty()){
                Toast.makeText(this, "이름을 입력해주세요", Toast.LENGTH_SHORT).show()
            }else{
                val intent = Intent(this, QuizQuestionActivity::class.java)
                startActivity(intent)
                finish()
            }
        }
    }
}