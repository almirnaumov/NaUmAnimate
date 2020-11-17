package com.example.naumanimate.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.naumanimate.R
import com.example.naumanimate.databinding.ActivityMainBinding
import com.example.naumanimate.databinding.FragmentTheoryBinding


class TheoryFragment : Fragment() {

    private lateinit var mainBinding: FragmentTheoryBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mainBinding = FragmentTheoryBinding.inflate(layoutInflater)
        return mainBinding.root
    }

    override fun onResume() {
        super.onResume()
    }
}