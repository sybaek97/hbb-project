package com.bhh.app.view.inventoryCheck

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.viewpager2.widget.ViewPager2
import com.bhh.app.R
import com.bhh.app.databinding.ActivityInventoryCheckBinding
import com.bhh.app.view.receive.ReceiveViewAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class InventoryCheckActivity: AppCompatActivity()  {
    private lateinit var binding:ActivityInventoryCheckBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding= DataBindingUtil.setContentView(this, R.layout.activity_inventory_check)
        binding.lifecycleOwner=this


        val tabLayout: TabLayout = binding.tabLayout
        val viewPager: ViewPager2 = binding.viewPager
        viewPager.adapter = InventoryCheckViewAdapter(this)


        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            when (position) {
                0 -> tab.text = "로케이션\n재고이동"
                1 -> tab.text = "재고\n조회"
                2 -> tab.text = "박스\n이동"
                3 -> tab.text = "품번\n조회"
                4 -> tab.text = "가격\n조회"
                5 -> tab.text = "박스\n내품"
            }
        }.attach()

    }
}