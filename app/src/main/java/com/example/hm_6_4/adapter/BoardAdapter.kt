package com.example.hm_6_4.adapter

import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.hm_6_4.fragment.FirstFragment
import com.example.hm_6_4.fragment.SecondFragment
import com.example.hm_6_4.fragment.ThirdFragment

class BoardAdapter (fm: FragmentActivity): FragmentStateAdapter(fm){

    private var fragments=3

    override fun getItemCount(): Int {
        return fragments
    }

    override fun createFragment(position: Int): Fragment {

        val getData = bundleOf(KEY_ARGUMENTS to fragments)
        val fm1= FirstFragment()
        val fm2= SecondFragment()
        val fm3=ThirdFragment()
        when(position){
            0->fm1.arguments=getData
            1->fm2.arguments=getData
            2->fm3.arguments=getData
        }
        return arrayOf(fm1,fm2,fm3)[position]
    }
    companion object{
        const val KEY_ARGUMENTS ="key"
    }
}