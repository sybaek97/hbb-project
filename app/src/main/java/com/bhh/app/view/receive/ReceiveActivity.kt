package com.bhh.app.view.receive

import android.app.DatePickerDialog
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.viewpager2.widget.ViewPager2
import com.bhh.app.R
import com.bhh.app.databinding.ActivityReceiveBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Locale

class ReceiveActivity:AppCompatActivity() {
    private lateinit var binding:ActivityReceiveBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding= DataBindingUtil.setContentView(this, R.layout.activity_receive)
        binding.lifecycleOwner=this
        val dateInput=binding.dateInput
        val dateButton = binding.dateButton
        val calendar = Calendar.getInstance()
        updateLabel(calendar)

        dateInput.setOnClickListener {
            DatePickerDialog(this, DatePickerDialog.OnDateSetListener { _, year, month, dayOfMonth ->
                calendar.set(Calendar.YEAR, year)
                calendar.set(Calendar.MONTH, month)
                calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth)
                updateLabel(calendar)
            }, calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH)).show()
        }

        // 버튼 클릭 리스너
        dateButton.setOnClickListener {
            Log.d("SelectedDate", dateInput.text.toString())
        }



        val tabLayout: TabLayout = binding.tabLayout
        val viewPager: ViewPager2 = binding.viewPager
        viewPager.adapter = ReceiveViewAdapter(this)


        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            when (position) {
                0 -> tab.text = "입고\n검수"
                1 -> tab.text = "검수\n내역"
                2 -> tab.text = "미검수\n내역"
                3 -> tab.text = "확정"
            }
        }.attach()


    }
    private fun updateLabel(calendar: Calendar) {
        val dateInput=binding.dateInput

        val format = "yyyy-MM-dd"
        val sdf = SimpleDateFormat(format, Locale.KOREAN)
        dateInput.setText(sdf.format(calendar.time))
    }
}