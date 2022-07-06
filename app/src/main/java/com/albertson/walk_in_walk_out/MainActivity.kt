package com.albertson.walk_in_walk_out

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.albertson.walk_in_walk_out.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
}