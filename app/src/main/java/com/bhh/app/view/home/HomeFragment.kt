package com.bhh.app.view.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.bhh.app.R
import com.bhh.app.application.BaseFragment
import com.bhh.app.databinding.FragmentHomeBinding

class HomeFragment() : BaseFragment() {
    override var isBackAvailable: Boolean = false

    private lateinit var binding:FragmentHomeBinding


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=DataBindingUtil.inflate(inflater, R.layout.fragment_home,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.lifecycleOwner=this
        binding.btnLogin1.setOnClickListener{
            findNavController().navigate(R.id.action_homeFragment_to_menuFragment)

        }

    }

}