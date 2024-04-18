package com.example.navigationdrawer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {

    //it is for hamburger sign that will open our drawer
    private lateinit var toggle:ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val drawerLayout1: DrawerLayout = findViewById(R.id.drawerLayout12)
        val navView: NavigationView = findViewById(R.id.nav_view)

        toggle = ActionBarDrawerToggle(this,drawerLayout1,R.string.open,R.string.close)
        drawerLayout1.addDrawerListener(toggle)
        toggle.syncState()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        navView.setNavigationItemSelectedListener {
            when(it.itemId){
                R.id.home1 -> Toast.makeText(applicationContext, "home clicked", Toast.LENGTH_LONG).show()
                R.id.delete1 -> Toast.makeText(applicationContext, "delete clicked", Toast.LENGTH_LONG).show()
                R.id.message1 -> Toast.makeText(applicationContext, "message clicked", Toast.LENGTH_LONG).show()
                R.id.settings1 -> Toast.makeText(applicationContext, "settings clicked", Toast.LENGTH_LONG).show()
                R.id.sync1 -> Toast.makeText(applicationContext, "sync clicked", Toast.LENGTH_LONG).show()
                R.id.login1 -> Toast.makeText(applicationContext, "login clicked", Toast.LENGTH_LONG).show()

            }
            true
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(toggle.onOptionsItemSelected(item)){
            return true
        }
        return super.onOptionsItemSelected(item)
    }




}