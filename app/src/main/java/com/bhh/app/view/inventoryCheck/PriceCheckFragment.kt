package com.bhh.app.view.inventoryCheck

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.bhh.app.R
import com.bhh.app.application.BaseFragment
import com.bhh.app.databinding.FragmentBoxContentsBinding
import com.bhh.app.databinding.FragmentPriceCheckBinding

class PriceCheckFragment : BaseFragment() {
    override var isBackAvailable: Boolean=false
    private lateinit var binding: FragmentPriceCheckBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding= DataBindingUtil.inflate(inflater, R.layout.fragment_price_check,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.lifecycleOwner = this
    }
}