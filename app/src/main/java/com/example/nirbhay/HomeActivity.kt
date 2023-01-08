package com.example.nirbhay

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.fragment_messages.*

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val firstFragment = HomeFragment()
        val secondFragment = MessagesFragment()
        val thirdFragment = LeaderboardFragment()


        setCurrentFragment(firstFragment)

        bottomNavigationView.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.miHome -> setCurrentFragment(firstFragment)
                R.id.miMsg -> setCurrentFragment(secondFragment)
                R.id.miLb  -> setCurrentFragment(thirdFragment)
            }
            true
        }
    }

    private fun setCurrentFragment(fragment: Fragment)=
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment, fragment)
            commit()
        }
}

