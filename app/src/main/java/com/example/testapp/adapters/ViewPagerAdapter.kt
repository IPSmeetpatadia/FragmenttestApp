package com.example.testapp.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.example.testapp.fragments.ChatFragment
import com.example.testapp.fragments.StatusFragment

class ViewPagerAdapter(supportFragmentManager: FragmentManager, var tabCount: Int)
    : FragmentStatePagerAdapter(supportFragmentManager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {


    override fun getCount(): Int {
        return tabCount
    }

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                return ChatFragment()
            }
            1 -> {
                return StatusFragment()
            }
            else -> {
                ChatFragment()
            }

        }
    }





}