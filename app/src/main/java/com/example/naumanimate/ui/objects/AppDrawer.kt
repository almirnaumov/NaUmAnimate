package com.example.naumanimate.ui.objects

import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.example.naumanimate.R
import com.example.naumanimate.ui.fragments.SettingsFragment
import com.mikepenz.materialdrawer.AccountHeader
import com.mikepenz.materialdrawer.AccountHeaderBuilder
import com.mikepenz.materialdrawer.Drawer
import com.mikepenz.materialdrawer.DrawerBuilder
import com.mikepenz.materialdrawer.model.DividerDrawerItem
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem
import com.mikepenz.materialdrawer.model.ProfileDrawerItem
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem

class AppDrawer (val mainActivity: AppCompatActivity, val toolbar: Toolbar) {
    private lateinit var mainDrawer: Drawer
    private lateinit var mainHeader: AccountHeader

    fun create() {
        createHeader()
        createDrawer()
    }

    private fun createDrawer() {
        mainDrawer = DrawerBuilder()
            .withActivity(mainActivity)
            .withToolbar(toolbar)
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
                DividerDrawerItem(),
                PrimaryDrawerItem().withIdentifier(102)
                    .withIconTintingEnabled(true)
                    .withName("О приложении")
                    .withSelectable(false)
                    .withIcon(R.drawable.ic_developer_project),
                PrimaryDrawerItem().withIdentifier(103)
                    .withIconTintingEnabled(true)
                    .withName("Настройки")
                    .withSelectable(false)
                    .withIcon(R.drawable.ic_customization)
            ).withOnDrawerItemClickListener(object : Drawer.OnDrawerItemClickListener {
                override fun onItemClick(
                    view: View?,
                    position: Int,
                    drawerItem: IDrawerItem<*>
                ): Boolean {
                    when (position) {
                        5 -> mainActivity.supportFragmentManager.beginTransaction()
                            .addToBackStack(null)
                            .replace(R.id.dataContainer,
                                SettingsFragment()
                            ).commit()
                    }
                    return false
                }

            }).build()
    }

    private fun createHeader() {
        mainHeader = AccountHeaderBuilder()
            .withActivity(mainActivity)
            .withHeaderBackground(R.drawable.header)
            .addProfiles(
                ProfileDrawerItem().withName("Almir Naumov")
                    .withEmail("+79997420920")
            ).build()


    }
}
