package com.example.testapp.activity

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.viewpager.widget.ViewPager
import com.example.testapp.R
import com.example.testapp.adapters.MyAdapter
import com.example.testapp.fragments.CallsFragment
import com.example.testapp.fragments.ChatFragment
import com.example.testapp.fragments.CommunityFragment
import com.example.testapp.fragments.StatusFragment
import com.google.android.material.tabs.TabLayout

class TabLayoutActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tab_layout)

        var tabLayout = findViewById<TabLayout>(R.id.tabLayout)
        var viewPager = findViewById<ViewPager>(R.id.viewPager)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction().replace(R.id.viewPager, ChatFragment()).commit()
        }

        val myAdapter = MyAdapter(supportFragmentManager)
        myAdapter.addFragment(CommunityFragment(), "")
        myAdapter.addFragment(ChatFragment(), "Chats")
        myAdapter.addFragment(StatusFragment(), "Status")
        myAdapter.addFragment(CallsFragment(), "Calls")

        viewPager.adapter = myAdapter
        tabLayout.setupWithViewPager(viewPager)

        viewPager.currentItem = 1

        val cardView = findViewById<CardView>(R.id.cdv)
        cardView.cardElevation = 0F

        tabLayout.getTabAt(0)!!.setIcon(R.drawable.baseline_groups_24)

        tabLayout.setSelectedTabIndicator(null)
    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.option_manu, menu)

        return super.onCreateOptionsMenu(menu)
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.menu_cam -> {
                Toast.makeText(this@TabLayoutActivity, "Camera", Toast.LENGTH_SHORT).show();
                return true
            }

            R.id.menu_search -> {
                Toast.makeText(this@TabLayoutActivity, "Search", Toast.LENGTH_SHORT).show();
                return true
            }

            R.id.menu_group -> {
                Toast.makeText(this@TabLayoutActivity, "Create New Group", Toast.LENGTH_SHORT).show();
                return true
            }

            R.id.menu_broadcast -> {
                Toast.makeText(this@TabLayoutActivity, "Create New Broadcast", Toast.LENGTH_SHORT).show();
                return true
            }

            R.id.menu_linkedDevice -> {
                Toast.makeText(this@TabLayoutActivity, "Linked Devices / WhatsApp Web", Toast.LENGTH_SHORT).show();
                return true
            }

            R.id.menu_payments -> {
                Toast.makeText(this@TabLayoutActivity, "WhatsApp Payments", Toast.LENGTH_SHORT).show();
                return true
            }

            R.id.menu_settings -> {
                Toast.makeText(this@TabLayoutActivity, "Settings", Toast.LENGTH_SHORT).show();
                return true
            }

            R.id.menu_starredMessages -> {
                Toast.makeText(this@TabLayoutActivity, "Starred Messages", Toast.LENGTH_SHORT).show();
                return true
            }

            else -> super.onOptionsItemSelected(item)
        }
    }

}