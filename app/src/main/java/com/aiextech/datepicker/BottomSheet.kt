package com.aiextech.datepicker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
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
    fun initView(){
        bottomSheet = BottomSheetBehavior.from(binding.root)
        binding.btSearchFilter.setOnClickListener {

        }

    }
}