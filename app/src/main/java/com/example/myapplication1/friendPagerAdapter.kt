package com.example.myapplication1

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class friendPagerAdapter(fm : FragmentManager):FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        return when(position){
            0->{Friend()}
            1->{Chatting()}
            else->{return Profile()}
        }
    }

    override fun getCount(): Int {
        return 3
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position){
            0->"친구"
            1->"채팅"
            else-> {return "프로필"}
        }
    }

}