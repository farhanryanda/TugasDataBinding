package com.farhanryanda.tugasdatabinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.farhanryanda.tugasdatabinding.adapter.NewsAdapter
import com.farhanryanda.tugasdatabinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.add(R.id.fc_main, HomeFragment())
        fragmentTransaction.commit()
    }
}