package com.ygs.dobcalc

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {

    private var tvSelectedDate: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnDatePicker: Button = findViewById(R.id.btnDatePicker)
        tvSelectedDate = findViewById(R.id.tvSelectedDate)

        btnDatePicker.setOnClickListener { view ->
            clickDatePicker()
        }
    }

    fun clickDatePicker(){

        // 현재 날짜 정보
        val myCalendar = Calendar.getInstance()
        val year = myCalendar.get(Calendar.YEAR)
        val month = myCalendar.get(Calendar.MONTH)
        val day = myCalendar.get(Calendar.DAY_OF_MONTH)

        DatePickerDialog(this,
            { view, selectedYear, selectedMonth, selectedDayOfMonth ->
                Toast.makeText(this,
                    "선택된 년도는 $selectedYear, 달은 ${selectedMonth+1} 일자는 ${selectedDayOfMonth} 입니다.", Toast.LENGTH_LONG).show()

                val selectedDate = "$selectedYear/${selectedMonth+1}/$selectedDayOfMonth"

                tvSelectedDate?.text = selectedDate

                val sdf = SimpleDateFormat("yyyy/MM/dd", Locale.KOREA)

                val theDate = sdf.parse(selectedDate)

            },
            year,
            month,
            day
        ).show()


    }
}