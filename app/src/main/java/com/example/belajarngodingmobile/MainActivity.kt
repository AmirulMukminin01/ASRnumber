package com.example.belajarngodingmobile


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import com.example.belajarngodingmobile.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvCounter.text = "1"
    }

    fun addNumber(v: View){
        val currVal = binding.tvCounter.text.toString().toInt()
        val nextVal = currVal + 1
        binding.tvCounter.text = nextVal.toString()
    }
    fun resetNumber(v: View){
        binding.tvCounter.text= "0"
    }
    fun subtractNumber(v: View){
        val currVal = binding.tvCounter.text.toString().toInt()
        val nextVal = currVal - 1
        binding.tvCounter.text = nextVal.toString()
    }
}