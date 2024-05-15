package com.bhh.app.view.inventoryCheck

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.bhh.app.R
import com.bhh.app.application.BaseFragment
import com.bhh.app.databinding.FragmentBoxContentsBinding
import com.bhh.app.databinding.FragmentPartNumberLookupBinding

class PartNumberLookupFragment : BaseFragment() {
    override var isBackAvailable: Boolean=false
    private lateinit var binding: FragmentPartNumberLookupBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding= DataBindingUtil.inflate(inflater, R.layout.fragment_part_number_lookup,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.lifecycleOwner = this
    }
}