package com.example.nirbhay

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main3.*

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val name = intent.getStringExtra("EXTRA_NAME")
        val personstring= "Hello $name Be Nirbhay"
        tvusername.text=personstring

        btnma3.setOnClickListener {
            val intent= Intent(this,HomeActivity::class.java)
            startActivity(intent)
        }

    }
}