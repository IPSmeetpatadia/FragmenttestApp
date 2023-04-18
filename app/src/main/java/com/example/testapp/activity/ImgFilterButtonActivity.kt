package com.example.testapp.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.testapp.R
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ImgFilterButtonActivity : AppCompatActivity() {

    private var isFabOpen = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_img_filter_button)

        val fbtn2 = findViewById<FloatingActionButton>(R.id.fbtn2)
        val fbtn3 = findViewById<FloatingActionButton>(R.id.fbtn3)
        val fbtn4 = findViewById<FloatingActionButton>(R.id.fbtn4)
        fbtn2.hide()
        fbtn3.hide()
        fbtn4.hide()


        findViewById<FloatingActionButton>(R.id.fbtn1).setOnClickListener {
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
}