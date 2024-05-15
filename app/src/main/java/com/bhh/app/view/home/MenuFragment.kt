package com.bhh.app.view.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.bhh.app.R
import com.bhh.app.application.BaseFragment
import com.bhh.app.databinding.FragmentMenuBinding

class MenuFragment() : BaseFragment() {
    override var isBackAvailable: Boolean=false

    private lateinit var binding: FragmentMenuBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= DataBindingUtil.inflate(inflater, R.layout.fragment_menu,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.lifecycleOwner=this

        binding.btnMenu1.setOnClickListener {
            findNavController().navigate(R.id.action_menuFragment_to_receiveActivity)
        }
        binding.btnMenu2.setOnClickListener{
            findNavController().navigate(R.id.action_menuFragment_to_inventoryCheckActivity)

        }
    }

}