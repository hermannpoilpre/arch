package com.example.hermann.arch.core

import android.app.Activity
import android.os.Bundle
import com.example.hermann.arch.core.R

class MainActivity: Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
    }

}