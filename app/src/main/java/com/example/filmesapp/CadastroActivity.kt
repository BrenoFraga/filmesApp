package com.example.filmesapp

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.filmesapp.databinding.ActivityCadastroBinding

class CadastroActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCadastroBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCadastroBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowTitleEnabled(false)
        supportActionBar?.setBackgroundDrawable(ColorDrawable(Color.parseColor("#232323")))
        initListeners()
    }

    private fun initListeners() {
        with(binding) {
            buttonCadastro.setOnClickListener {

            }
        }
    }
}