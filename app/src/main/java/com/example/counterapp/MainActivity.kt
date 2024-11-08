package com.example.counterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.counterapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    lateinit var binding: ActivityMainBinding
    private var counter = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.incrementBtn.setOnClickListener {
            binding.counterTv.text = incrementCounter().toString()
        }
        binding.decrementBtn.setOnClickListener {
            binding.counterTv.text = decreasecounter().toString()
        }
    }
    private fun incrementCounter() : Int {
        return ++counter
    }

    private fun decreasecounter() : Int {
        if(counter > 0){
            counter--
        }else{
            Toast.makeText(this, "Counter Value cannot be less than ZERO", Toast.LENGTH_LONG).show()
        }
        return counter

    }
}