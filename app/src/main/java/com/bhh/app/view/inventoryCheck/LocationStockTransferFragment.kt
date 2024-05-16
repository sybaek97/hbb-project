package com.bhh.app.view.inventoryCheck

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.core.view.isVisible
import androidx.databinding.DataBindingUtil
import com.bhh.app.R
import com.bhh.app.application.BaseFragment
import com.bhh.app.databinding.FragmentLocationStockTransferBinding


class LocationStockTransferFragment : BaseFragment() {
    override var isBackAvailable: Boolean=false
    private lateinit var binding: FragmentLocationStockTransferBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding= DataBindingUtil.inflate(inflater, R.layout.fragment_location_stock_transfer,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.lifecycleOwner = this

        binding.checkStage.setOnCheckedChangeListener { _, isChecked ->
            binding.checkGeneralMove.isChecked = !isChecked
            binding.stageContain.isVisible = isChecked
        }
        binding.checkGeneralMove.setOnCheckedChangeListener { _, isChecked ->
            binding.checkStage.isChecked = !isChecked
            binding.stageContain.isVisible = !isChecked
        }
        val simpleSpinner: Spinner = binding.selectSpinner
        val adapter = ArrayAdapter.createFromResource(
            requireContext(),
            R.array.spinner_items, android.R.layout.simple_spinner_item
        )
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        simpleSpinner.adapter = adapter
    }
}