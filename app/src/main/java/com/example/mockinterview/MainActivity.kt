package com.example.mockinterview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //put in on click listener
        val sharedPref = getSharedPreferences("custom", MODE_PRIVATE)
       sharedPref.edit().apply() {
           putString("settings", "some settings information")
           commit()
        }

        sharedPref.getString("settings", "")
    }
}