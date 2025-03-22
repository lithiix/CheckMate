package com.example.checkmate.onboarding

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.checkmate.R
import com.example.checkmate.login

class ob3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_ob3)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val getstarted = findViewById<Button>(R.id.btngetstarted)
        getstarted.setOnClickListener{
            val intent3 = Intent (this,login::class.java)
            startActivity(intent3)
        }

        val skip = findViewById<TextView>(R.id.tvSkip1)
        skip.setOnClickListener{
            val intent2 = Intent(this,login::class.java)
            startActivity(intent2)
        }
    }
}