package com.ygs.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private var textViewInput: TextView? = null
    var lastNumeric: Boolean = false
    var lastDot:Boolean = false


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textViewInput = findViewById(R.id.textViewInput)
    }

    fun onDigit(view: View) {
        // Toast.makeText(this, "Button Clicked", Toast.LENGTH_SHORT).show()
        textViewInput?.append((view as Button).text)
        lastNumeric = true
        lastDot = false
    }

    fun onClear(view: View){
        textViewInput?.text = ""
    }

    fun onDecimalPoint(view: View){
        if(lastNumeric && !lastDot){
            textViewInput?.append(".")
            lastNumeric = false
            lastDot = true
        }
    }

    fun onOperator(view: View){
        textViewInput?.text?.let{
            if(lastNumeric && !isOperatorAdded(it.toString())){
                textViewInput?.append((view as Button).text)
                lastNumeric = false
                lastDot = false
            }
        }
    }

    private fun isOperatorAdded(value: String): Boolean{
        return if(value.startsWith("-")){
            false
        }else{
            value.contains("/")
                    || value.contains("*")
                    || value.contains("+")
                    || value.contains("-")
        }
    }

}