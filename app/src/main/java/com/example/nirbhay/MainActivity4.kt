package com.example.nirbhay

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main4.*

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
                    imageView6.setOnClickListener{
                        val i = Intent(this,Messages::class.java).also {
                            startActivity(it)
                        }
                        }
                        imageView7.setOnClickListener {
                          val j = Intent(this,HomeActivity::class.java).also{
                              startActivity(it)
                          }
                        }

                }
            }
