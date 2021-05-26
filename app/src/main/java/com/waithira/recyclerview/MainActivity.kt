package com.waithira.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.waithira.recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var _binding: ActivityMainBinding? =null
    private val  binding get()= _binding!!
    private val personAdapter = Adapter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initRecyclerView()
    }

    private fun initRecyclerView() {
        binding.recyclerview.apply {
            adapter = personAdapter
        }
    }

}