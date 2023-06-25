package com.sample.loginapp

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val loginBtn: Button = findViewById(R.id.btnlogin)
        val etEmailAddress : EditText = findViewById(R.id.etEmailAddress)
        val etPassword : EditText = findViewById(R.id.etpassword)


        loginBtn.setOnClickListener{
            val isEmailValid =  isEmailValid(etEmailAddress.text.toString())
            val isValidPassword = isPasswordValid(etPassword.text.toString())
            if ( isEmailValid && isValidPassword) {
                startActivity(
                    Intent(this@MainActivity, Welcome::class.java)
                )
            }
            else {

                val errorMessage = when {
                    !isEmailValid && !isValidPassword -> "Please insert a valid email and password."
                    !isEmailValid -> "Please insert a valid email."
                    !isValidPassword -> "Please insert a valid password."
                    else -> null
                }

                errorMessage?.let { showToast(this@MainActivity, it) }
            }

        }


    }

    fun isEmailValid(email: String): Boolean {
        val emailPattern = Regex("[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}")
        return email.matches(emailPattern)
    }

    fun isPasswordValid(password: String): Boolean {
        val passwordPattern = Regex("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$")
        return password.matches(passwordPattern)
    }

    fun showToast(context: Context, message: String) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }
}