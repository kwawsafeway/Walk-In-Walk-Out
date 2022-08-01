package com.albertson.walk_in_walk_out

import android.app.Fragment
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.albertson.walk_in_walk_out.databinding.ActivityMainBinding
import com.albertson.walk_in_walk_out.ui.homeFragment.viewModel.HomeFragment


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .setReorderingAllowed(true)
                .add(R.id.fragment_container_view, HomeFragment::class.java, null)
                .commit()
        }
    }

    private fun navigateToFragment(fragment: androidx.fragment.app.Fragment) {
        val manager: android.app.FragmentManager? = fragmentManager
        supportFragmentManager.beginTransaction()
            .setReorderingAllowed(true)
            .add(R.id.fragment_container_view, HomeFragment::class.java, null)
            .commit()


    }
    fun replaceFragment(fragment: androidx.fragment.app.Fragment){
        val manager: android.app.FragmentManager? = fragmentManager
        supportFragmentManager.beginTransaction()
            .setReorderingAllowed(true)
            .replace(R.id.fragment_container_view, HomeFragment::class.java, null)
            .commit()

    }
}