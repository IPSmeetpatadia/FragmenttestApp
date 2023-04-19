package com.example.testapp.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.Fragment
import com.example.testapp.R
import com.example.testapp.databinding.ActivityFabMenuBinding
import com.google.android.material.floatingactionbutton.FloatingActionButton

class FabMenuActivity : AppCompatActivity() {

    lateinit var binding: ActivityFabMenuBinding

    private var isFabOpen = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFabMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.bottomMenuBar.menu.getItem(2).isEnabled = false

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragmentContainer, Home())
            commit()
        }

        binding.bottomMenuBar.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.menuHome -> {
                    setFragment(Home())
                    true
                }
                R.id.menuEvents -> {
                    setFragment(Events())
                    true
                }
                R.id.menuToDo -> {
                    setFragment(ToDo())
                    true
                }
                R.id.menuSetting -> {
                    setFragment(Setting())
                    true
                }
                else -> false
            }
        }

        val fbtn2 = findViewById<FloatingActionButton>(R.id.fbtn2)
        val fbtn3 = findViewById<FloatingActionButton>(R.id.fbtn3)
        val fbtn4 = findViewById<FloatingActionButton>(R.id.fbtn4)
        val layoutManu = findViewById<ConstraintLayout>(R.id.layoutMenu)
        layoutManu.setBackgroundResource(0)
        fbtn2.hide()
        fbtn3.hide()
        fbtn4.hide()


        findViewById<FloatingActionButton>(R.id.fab).setOnClickListener {
            manageMenu()
        }

    }

    private fun manageMenu() {
        val fbtn1 = findViewById<FloatingActionButton>(R.id.fbtn1)
        val fbtn2 = findViewById<FloatingActionButton>(R.id.fbtn2)
        val fbtn3 = findViewById<FloatingActionButton>(R.id.fbtn3)
        val fbtn4 = findViewById<FloatingActionButton>(R.id.fbtn4)
        val layoutManu = findViewById<ConstraintLayout>(R.id.layoutMenu)


        if (isFabOpen) {
            isFabOpen = false

            layoutManu.setBackgroundResource(0)
            fbtn2.hide()
            fbtn3.hide()
            fbtn4.hide()

        }
        else {
            isFabOpen = true

            layoutManu.setBackgroundResource(R.drawable.shape_top_corner)
            fbtn2.show()
            fbtn3.show()
            fbtn4.show()

        }
    }

    fun setFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragmentContainer, fragment)
            addToBackStack(null)
            commit()
        }
    }

}