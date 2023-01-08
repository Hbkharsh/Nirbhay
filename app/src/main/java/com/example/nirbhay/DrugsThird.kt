package com.example.nirbhay

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_drugs_third.*
import java.text.NumberFormat
import java.util.*

class DrugsThird : AppCompatActivity() {

    var startPoint = 0
    var endPoint= 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_drugs_third)

        buttonSubmit.setOnClickListener {
            val i = Intent(this,Done::class.java).also{
                startActivity(it)
            }
        }
         seekBar3.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
             override fun onProgressChanged(p0: SeekBar?, progress: Int, fromuser: Boolean) {
                textView15.text = progress.toString()
             }

             override fun onStartTrackingTouch(seekBar: SeekBar?) {
                 if (seekBar != null) {
                     startPoint = seekBar.progress
                 }
             }

             override fun onStopTrackingTouch(seekBar: SeekBar?) {
                 if (seekBar != null) {
                     endPoint = seekBar.progress
                 }
                 Toast.makeText(this@DrugsThird,  "you are ${endPoint - startPoint}% sure", Toast.LENGTH_SHORT).show()
             }

         })

    }
}