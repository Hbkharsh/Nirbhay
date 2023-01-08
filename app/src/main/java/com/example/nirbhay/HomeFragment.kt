package com.example.nirbhay

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main3.*
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment(R.layout.fragment_home){

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        imageView7.setOnClickListener {
            val i = Intent(this@HomeFragment.requireContext(),Drugs::class.java).also {
                startActivity(it)
            }
        }
        imageView6.setOnClickListener {
            val j = Intent(this@HomeFragment.requireContext(),Drugs::class.java).also {
                startActivity(it)
            }
        }
    }
}



//class HomeFragment : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.fragment_home)
//
//        val name = intent.getStringExtra("EXTRA_NAME")
//        val personstring = "Hello $name Be Nirbhay"
//        tvfragwelcome.text = personstring
//    }
//}