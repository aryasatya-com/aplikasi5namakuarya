package com.smkth.aplikasi5namakuarya

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.smkth.aplikasi5namakuarya.databinding.ActivityFragmentBinding
import com.smkth.aplikasi5namakuarya.fragment.FirstFragment
import com.smkth.aplikasi5namakuarya.fragment.SecondFragment

class FragmentActivity : AppCompatActivity() {
    private lateinit var fragmentManager: FragmentManager
    private lateinit var binding: ActivityFragmentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityFragmentBinding.inflate(layoutInflater)
        setContentView(binding.root)
        goToFragment(FirstFragment())  // Buka fragment pertama saat aplikasi dijalankan
        binding.Fragment1.setOnClickListener {
            goToFragment(FirstFragment())
        }
        binding.Fragment2.setOnClickListener {
            goToFragment(SecondFragment())
        }
    }

    private fun goToFragment(fragment: Fragment) {
        fragmentManager = supportFragmentManager
        fragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer, fragment)
            .commit()
    }
}
