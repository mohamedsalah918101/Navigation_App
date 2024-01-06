package com.petra.buttonnavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Homefragment:Fragment = HomeFragment()
        val fragmentTransaction:FragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.main,Homefragment).commit()

        val ButtonNav = findViewById(R.id.ButtonNav) as BottomNavigationView
        ButtonNav.setOnItemSelectedListener()
        {
            when(it.itemId)
            {
                R.id.home -> {
                    val Homefragment:Fragment = HomeFragment()
                    val fragmentTransaction:FragmentTransaction = supportFragmentManager.beginTransaction()
                    fragmentTransaction.replace(R.id.main,Homefragment).commit()
                    true
                }
                R.id.search -> {
                    val Searchfragment:Fragment = SearchFragment()
                    val fragmentTransaction:FragmentTransaction = supportFragmentManager.beginTransaction()
                    fragmentTransaction.replace(R.id.main,Searchfragment).commit()
                    true
                }
                R.id.settings -> {
                    val Settingsfragment:Fragment = SettingsFragment()
                    val fragmentTransaction:FragmentTransaction = supportFragmentManager.beginTransaction()
                    fragmentTransaction.replace(R.id.main,Settingsfragment).commit()
                    true
                }

                else -> {
                    true
                }
            }
        }

    }
}

