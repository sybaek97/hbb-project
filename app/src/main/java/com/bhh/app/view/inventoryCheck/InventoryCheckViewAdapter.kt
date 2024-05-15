package com.bhh.app.view.inventoryCheck

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class InventoryCheckViewAdapter(fragmentActivity: FragmentActivity): FragmentStateAdapter(fragmentActivity) {

    override fun createFragment(position: Int): Fragment {

        return when(position){
            0 -> LocationStockTransferFragment()
            1 -> InventoryCheckFragment()
            2 -> BoxMovementFragment()
            3-> PartNumberLookupFragment()
            4 -> PriceCheckFragment()
            5 -> BoxContentsFragment()
            else -> throw IllegalStateException("Unexpected position $position")
        }
    }
    override fun getItemCount(): Int = 6 // 네 개의 프래그먼트
}