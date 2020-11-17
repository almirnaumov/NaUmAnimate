package com.example.naumanimate.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.naumanimate.R
import com.example.naumanimate.databinding.FragmentSettingsBinding
import com.example.naumanimate.databinding.FragmentTheoryBinding


class SettingsFragment : Fragment() {

    private lateinit var mainBinding: FragmentSettingsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mainBinding = FragmentSettingsBinding.inflate(layoutInflater)
        return mainBinding.root
    }

    override fun onResume() {
        super.onResume()
    }
}