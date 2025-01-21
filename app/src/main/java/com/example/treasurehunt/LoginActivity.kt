package com.example.treasurehunt

import android.content.Context
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_page)

        val emailEditText: EditText = findViewById(R.id.emailEditText)
        val passwordEditText: EditText = findViewById(R.id.passwordEditText)
        val loginButton: Button = findViewById(R.id.loginButton)

        loginButton.setOnClickListener {
            val email = emailEditText.text.toString().trim()
            val password = passwordEditText.text.toString().trim()

            if (email.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Email and password cannot be empty", Toast.LENGTH_SHORT).show()
            } else {
                // Simulate successful login
                val sharedPreferences = getSharedPreferences("AppPrefs", Context.MODE_PRIVATE)
                sharedPreferences.edit().putBoolean("LoggedIn", true).apply()

                Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show()

                // Navigate back to MainActivity (or another activity)
                startActivity(Intent(this, MainActivity::class.java))
                finish()
            }
        }
    }
}
