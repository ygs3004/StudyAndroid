package com.ygs.workout

import android.app.Application

class WorkOutApp: Application() {

    val db by lazy {
        HistoryDatabase.getInstance(this)
    }

}