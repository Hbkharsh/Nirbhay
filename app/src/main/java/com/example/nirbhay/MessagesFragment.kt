package com.example.nirbhay


import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.View.inflate
import android.view.ViewGroup
import android.widget.Button
import androidx.core.graphics.drawable.DrawableCompat.inflate
import androidx.fragment.app.Fragment

import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.fragment_messages.*
import kotlinx.android.synthetic.main.fragment_messages.view.*


class MessagesFragment : Fragment(R.layout.fragment_messages) {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        imageView9.setOnClickListener {
            val i = Intent(this@MessagesFragment.requireContext(), Messages::class.java).also {
                startActivity(it)
            }
        }
    }
}






