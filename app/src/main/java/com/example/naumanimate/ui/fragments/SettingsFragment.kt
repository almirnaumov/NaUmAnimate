package com.example.naumanimate.ui.fragments

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import com.example.naumanimate.R
import com.example.naumanimate.databinding.FragmentSettingsBinding
import com.example.naumanimate.databinding.FragmentTheoryBinding


class SettingsFragment : BaseFragment(R.layout.fragment_settings) {



    override fun onResume() {
        super.onResume()
        setHasOptionsMenu(true)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
    activity?.menuInflater?.inflate(R.menu.settings_action_menu,menu)
    }
}