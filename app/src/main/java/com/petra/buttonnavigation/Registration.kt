package com.petra.buttonnavigation

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Registration : AppCompatActivity() {

    private lateinit var sharedpref: SharedPreferences


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

        // Send Shared Preferences
        sharedpref= this.getSharedPreferences("fileshared", Context.MODE_PRIVATE)

        val name:EditText = findViewById(R.id.rigstName)
        val pass:EditText = findViewById(R.id.rigstPass)

        val login:Button = findViewById(R.id.login)
        login.setOnClickListener(){
            if(name.text.isNotEmpty() && pass.text.isNotEmpty())
            {
                sharedpref.edit().putString("name",name.text.trim().toString()).apply()
                sharedpref.edit().putString("pass",pass.text.trim().toString()).apply()
                val intent = Intent(this@Registration, MainActivity::class.java)
                startActivity(intent)
                finish()
            }
            else{
                Toast.makeText(this,"Enter Name and Password",Toast.LENGTH_SHORT).show()
            }

        }
    }
}