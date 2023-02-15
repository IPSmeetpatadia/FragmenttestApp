package com.example.testapp

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.view.Gravity
import android.view.View
import android.widget.Toast
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)

        bottomNavigationView.setOnNavigationItemReselectedListener {
            when(it.itemId) {
                R.id.bottom_home -> {
                    Toast.makeText(this@MainActivity4, "Home", Toast.LENGTH_SHORT).show()
                }
                R.id.bottom_search -> {
                    Toast.makeText(this@MainActivity4, "Home", Toast.LENGTH_SHORT).show()
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