package com.bhh.app.view.receive

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class ReceiveViewAdapter(fragmentActivity: FragmentActivity): FragmentStateAdapter(fragmentActivity) {

    override fun createFragment(position: Int): Fragment {

        return when(position){
            0 -> ReceivingInspectionFragment()
            1 -> InspectionDetailsFragment()
            2 -> UninspectedDetailsFragment()
            3-> ConfirmationFragment()
            else -> throw IllegalStateException("Unexpected position $position")
        }
    }
    override fun getItemCount(): Int = 4 // 네 개의 프래그먼트
}