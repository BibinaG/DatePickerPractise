package com.aiextech.datepicker.dropdown

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.aiextech.datepicker.R
import com.aiextech.datepicker.databinding.ActivityDatePickerBinding
import com.aiextech.datepicker.databinding.ActivityDropDownBinding

class DropDownActivity : AppCompatActivity() {


    override fun onResume() {
        super.onResume()
        val languages = resources.getStringArray(R.array.Genders)
        val arrayAdapter = ArrayAdapter(this, R.layout.dropdown_item, languages)
        binding.autoCompleteTextView.setAdapter(arrayAdapter)
    }

    private val binding by lazy {
        ActivityDropDownBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        /*val languages = resources.getStringArray(R.array.Genders)
        val arrayAdapter = ArrayAdapter(this, R.layout.dropdown_item, languages)
        binding.autoCompleteTextView.setAdapter(arrayAdapter)*/
    }
}