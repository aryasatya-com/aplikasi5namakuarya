package com.smkth.aplikasi5namakuarya.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.smkth.aplikasi5namakuarya.R
import com.smkth.aplikasi5namakuarya.databinding.FragmentFirstBinding



class FirstFragment : Fragment() {
   private lateinit var binding: FragmentFirstBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate(inflater,container,false)
        val view = binding.root
        return view

    }
}

