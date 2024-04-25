package com.example.realsignupui

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.realsignupui.databinding.SignedInBinding
import com.google.android.material.snackbar.Snackbar

class SignedIn : AppCompatActivity() {
    private lateinit var binding: SignedInBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = SignedInBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnSubmitLogin.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        binding.imgBtnBack.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }
}