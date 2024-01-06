package com.petra.buttonnavigation

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.Timer
import java.util.TimerTask

class Splash : AppCompatActivity() {

    private lateinit var shared: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        // get Shared Preferences
        shared = getSharedPreferences("fileshared", Context.MODE_PRIVATE)

        Timer().schedule(object : TimerTask(){
            override fun run() {
                // get Shared Preferences
                if (shared.getString("name","").toString().isNotEmpty() && shared.getString("pass","").toString().isNotEmpty())
                {
                    val intent = Intent(this@Splash,MainActivity::class.java)
                    startActivity(intent)
                    finish()
                } else {
                    val intent = Intent(this@Splash,Registration::class.java)
                    startActivity(intent)
                    finish()
                }
            }
        },2000)
    }
}