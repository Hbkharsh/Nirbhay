package com.example.nirbhay

import android.content.Intent
import android.os.Build.VERSION_CODES.N
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*
import java.util.jar.Attributes.Name

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        btnma2.setOnClickListener {
            val name = etusername.text.toString()
            val i = Intent(this,MainActivity3::class.java).also{
                it.putExtra("EXTRA_NAME",name)
                startActivity(it)
            }

        }
    }
}
