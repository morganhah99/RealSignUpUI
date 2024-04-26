package com.example.realsignupui
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.realsignupui.databinding.SignUpBinding


class SignUp : AppCompatActivity() {
    private lateinit var binding: SignUpBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = SignUpBinding.inflate(layoutInflater)
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