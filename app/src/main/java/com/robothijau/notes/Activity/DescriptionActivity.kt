package com.robothijau.notes.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.robothijau.notes.R

class DescriptionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_description)
        supportActionBar?.hide()
    }
}