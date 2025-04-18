package com.example.checkmate

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.checkmate.onboarding.ob1

class MainActivity : AppCompatActivity() {

    companion object {
        private const val SPLASH_SCREEN: Long = 4000  // Correct way to define a constant in Kotlin
    }

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Using Handler properly in Kotlin
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this@MainActivity, ob1::class.java) // Correct Intent usage
            startActivity(intent)
            finish()
        }, SPLASH_SCREEN)
    }
}
