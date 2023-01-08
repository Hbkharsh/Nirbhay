package com.example.nirbhay

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_drugs_second.*

class DrugsSecond : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_drugs_second)

        btnDrugs2.setOnClickListener {
            val i = Intent(this,DrugsThird::class.java).also{
                startActivity(it)
            }
        }
    }
}