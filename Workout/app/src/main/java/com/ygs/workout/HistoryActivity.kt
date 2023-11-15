package com.ygs.workout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ygs.workout.databinding.ActivityHistoryBinding

class HistoryActivity : AppCompatActivity() {

    private var binding: ActivityHistoryBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHistoryBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        setSupportActionBar(binding?.toolbarHistoryActivity)
        if(supportActionBar != null){
            supportActionBar?.setDisplayHomeAsUpEnabled(true)
            supportActionBar?.title = "기록"
        }
        
        binding?.toolbarHistoryActivity?.setNavigationOnClickListener{
            onBackPressed()
        }

    }
}