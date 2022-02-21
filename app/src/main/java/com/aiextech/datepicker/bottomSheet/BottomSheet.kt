package com.aiextech.datepicker.bottomSheet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.aiextech.datepicker.bottomSheet.BottomSheetBehaviour.Companion.collapse
import com.aiextech.datepicker.bottomSheet.BottomSheetBehaviour.Companion.expand
import com.aiextech.datepicker.databinding.ActivityBottomSheetBinding
import com.google.android.material.bottomsheet.BottomSheetBehavior


class BottomSheet : AppCompatActivity() {
    private lateinit var  bottomSheet: BottomSheetBehavior<View>

    private val binding by lazy {
        ActivityBottomSheetBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        initView()
    }
    private fun initView(){
        bottomSheet = BottomSheetBehavior.from(binding.root)
        bottomSheet.collapse()
        binding.btSearchFilter.setOnClickListener {
        bottomSheet.expand()
        }
    }
}

