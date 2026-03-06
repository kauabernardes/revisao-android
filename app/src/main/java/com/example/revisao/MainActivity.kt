package com.example.revisao

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.revisao.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                enableEdgeToEdge()

                binding = ActivityMainBinding.inflate(layoutInflater)

                setContentView(binding.root)

                binding.loginButton.setOnClickListener {
                    val login = binding.loginInput.text.toString()
                    val senha = binding.passwordInput.text.toString()

                    if (login == "kaua" && senha == "admin"){
                        val intent = Intent(this, Dashboard::class.java)
                        intent.putExtra("LOGIN_USUARIO", login)
                        startActivity(intent)
                        finish()
                    } else {
                        Toast.makeText(this, "Login ou senha incorretos",Toast.LENGTH_LONG).show()
                    }
                }

        }
}