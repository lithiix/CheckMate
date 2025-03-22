package com.example.checkmate.onboarding

import android.annotation.SuppressLint
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

class ob1 : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_ob1)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val next1 = findViewById<Button>(R.id.btnObNext1)
        next1.setOnClickListener{
            val intent1 = Intent (this,ob2::class.java)
            startActivity(intent1)
        }

        val skip = findViewById<TextView>(R.id.tvSkip1)
        skip.setOnClickListener{
            val intent2 = Intent(this,login::class.java)
            startActivity(intent2)
        }


    }


}