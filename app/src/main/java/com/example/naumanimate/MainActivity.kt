package com.example.naumanimate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import com.example.naumanimate.databinding.ActivityMainBinding
import com.example.naumanimate.ui.fragments.TheoryFragment
import com.example.naumanimate.ui.objects.AppDrawer

class MainActivity : AppCompatActivity() {

    private lateinit var mainBinding: ActivityMainBinding
private lateinit var  mainAppDrawer:AppDrawer
    private lateinit var mainToolbar: Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)
    }

    override fun onStart() {
        super.onStart()
        initFields()
initFunc()
    }

    private fun initFunc() {
        setSupportActionBar(mainToolbar)
        mainAppDrawer.create()
        supportFragmentManager.beginTransaction()
            .replace(R.id.dataContainer,
                TheoryFragment()
            ).commit()

    }



    private fun initFields() {
        mainToolbar=mainBinding.mainToolbar
        mainAppDrawer=AppDrawer(this,mainToolbar)
    }
}