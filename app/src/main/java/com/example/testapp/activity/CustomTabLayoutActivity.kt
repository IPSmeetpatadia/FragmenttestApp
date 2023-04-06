package com.example.testapp.activity

import android.content.res.ColorStateList
import android.graphics.Color
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.viewpager.widget.ViewPager
import com.example.testapp.R
import com.example.testapp.adapters.ViewPagerAdapter
import com.example.testapp.fragments.ChatFragment

class CustomTabLayoutActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var tab1: TextView
    private lateinit var tab2: TextView
    private lateinit var select: TextView
    private lateinit var def: ColorStateList
    private lateinit var viewPager: ViewPager

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom_tab_layout)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction().replace(R.id.viewPager2, ChatFragment()).commit()
        }

        tab1 = findViewById(R.id.tab1)
        tab2 = findViewById(R.id.tab2)
        select = findViewById(R.id.select_tab)
        viewPager = findViewById(R.id.viewPager2)

        viewPager.adapter = ViewPagerAdapter(supportFragmentManager, 2)
        viewPager.offscreenPageLimit = 2
        viewPager.currentItem = 0

        tab1.setOnClickListener(this)
        tab2.setOnClickListener(this)

        def = tab2.textColors
    }

    override fun onClick(view: View?) {
        if (view?.id == R.id.tab1) {
            select.animate().x(0F).duration = 50
            tab2.setTextColor(def)
            tab1.setTextColor(Color.WHITE)
            viewPager.currentItem = 0
        }
        else if (view?.id == R.id.tab2) {
            val size = tab2.width.toFloat()
            select.animate().x(size).duration = 50
            tab2.setTextColor(Color.WHITE)
            tab1.setTextColor(def)
            viewPager.currentItem = 1
        }
    }
}