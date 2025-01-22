
package com.example.treasurehunt

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import com.example.treasurehunt.ui.theme.LoginActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Hide the action bar
        supportActionBar?.hide()

        val loginButton = findViewById<Button>(R.id.loginButton)
        loginButton.setOnClickListener {
            // Start LoginActivity
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}
