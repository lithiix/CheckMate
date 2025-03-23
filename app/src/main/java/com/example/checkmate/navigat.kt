package com.example.checkmate

import android.os.Bundle
import android.widget.FrameLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import com.example.checkmate.databinding.ActivityNavigatBinding // Use correct binding class

class navigat : AppCompatActivity() {

    private lateinit var binding: ActivityNavigatBinding


    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityNavigatBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Make FrameLayout transparent
        binding.frameLayout.setBackgroundColor(android.graphics.Color.TRANSPARENT)



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        replaceFragment(home())

        binding.bottomNavigationView.setOnItemSelectedListener {
            when(it.itemId) {
                R.id.home -> replaceFragment(home())
                R.id.list -> replaceFragment(taskList())
                R.id.addTask -> replaceFragment(addTask())
                R.id.analytics -> replaceFragment(analytics())
                R.id.profile -> replaceFragment(profile())
                else -> {}
            }
            true
        }

        binding.fab.setOnClickListener {
            replaceFragment(addTask())
        }

    }

    private fun replaceFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame_layout, fragment)
        fragmentTransaction.commit()
    }


}
