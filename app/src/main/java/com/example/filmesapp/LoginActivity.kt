package com.example.filmesapp

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.filmesapp.databinding.ActivityLoginBinding
import com.example.filmesapp.databinding.ActivityMainBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding : ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowTitleEnabled(false)
        supportActionBar?.setBackgroundDrawable(ColorDrawable(Color.parseColor("#232323")))
        initListeners()
    }

    private fun initListeners() {
        with(binding){
            buttonLogin.setOnClickListener {

            }
        }
    }
}