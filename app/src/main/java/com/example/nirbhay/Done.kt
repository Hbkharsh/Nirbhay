package com.example.nirbhay

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_done.*

class Done : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_done)

        buttonhome.setOnClickListener {
            val i = Intent(this,HomeActivity::class.java).also{
                startActivity(it)
            }
        }
    }
}