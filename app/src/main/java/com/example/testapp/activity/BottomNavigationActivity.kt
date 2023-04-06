package com.example.testapp.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.testapp.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class BottomNavigationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom_navigation)

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)

        bottomNavigationView.setOnNavigationItemReselectedListener {
            when(it.itemId) {
                R.id.bottom_home -> {
                    Toast.makeText(this@BottomNavigationActivity, "Home", Toast.LENGTH_SHORT).show()
                }
                R.id.bottom_search -> {
                    Toast.makeText(this@BottomNavigationActivity, "Home", Toast.LENGTH_SHORT).show()
                }
                R.id.bottom_video -> {
                    Toast.makeText(this, "Home", Toast.LENGTH_SHORT).show()
                }
                R.id.bottom_favorite -> {
                    Toast.makeText(this, "Home", Toast.LENGTH_SHORT).show()
                }
                R.id.bottom_profile -> {
                    Toast.makeText(this, "Home", Toast.LENGTH_SHORT).show()
                }
            }
        }


    }












}