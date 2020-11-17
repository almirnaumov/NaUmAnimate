package com.example.naumanimate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import com.example.naumanimate.databinding.ActivityMainBinding
import com.mikepenz.materialdrawer.AccountHeader
import com.mikepenz.materialdrawer.AccountHeaderBuilder
import com.mikepenz.materialdrawer.Drawer
import com.mikepenz.materialdrawer.DrawerBuilder
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem
import com.mikepenz.materialdrawer.model.ProfileDrawerItem

class MainActivity : AppCompatActivity() {

    private lateinit var mainBinding: ActivityMainBinding
    private lateinit var mainDrawer: Drawer
    private lateinit var mainHeader: AccountHeader
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
        createHeader()
        createDrawer()
    }

    private fun createDrawer() {
        mainDrawer=DrawerBuilder()
            .withActivity(this)
            .withToolbar(mainToolbar)
            .withActionBarDrawerToggle(true)
            .withSelectedItem(-1)
            .withAccountHeader(mainHeader)
            .addDrawerItems(
                PrimaryDrawerItem().withIdentifier(100)
                    .withIconTintingEnabled(true)
                    .withName("Теория")
                    .withSelectable(false)
                    .withIcon(R.drawable.ic_theory),
                PrimaryDrawerItem().withIdentifier(101)
                    .withIconTintingEnabled(true)
                    .withName("Диагностика")
                    .withSelectable(false)
                    .withIcon(R.drawable.ic_practice),
                PrimaryDrawerItem(),
                        PrimaryDrawerItem().withIdentifier(102)
                    .withIconTintingEnabled(true)
                    .withName("О приложении")
                    .withSelectable(false)
                    .withIcon(R.drawable.ic_developer_project),
                PrimaryDrawerItem().withIdentifier(104)
                    .withIconTintingEnabled(true)
                    .withName("Настройки")
                    .withSelectable(false)
                    .withIcon(R.drawable.ic_customization)
            ).build()
    }

    private fun createHeader() {
        mainHeader= AccountHeaderBuilder()
            .withActivity(this)
            .withHeaderBackground(R.drawable.header)
            .addProfiles(
                ProfileDrawerItem().withName("Almir Naumov")
                    .withEmail("+79997420920")
            ).build()


    }

    private fun initFields() {
        mainToolbar=mainBinding.mainToolbar

    }
}