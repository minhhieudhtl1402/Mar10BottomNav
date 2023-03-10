package com.vmhieu.mar10bottomnav.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.vmhieu.mar10bottomnav.databinding.FragmentStarBinding

class StarFragment : Fragment() {
    private lateinit var binding: FragmentStarBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentStarBinding.inflate(layoutInflater)
        return binding.root
    }
}