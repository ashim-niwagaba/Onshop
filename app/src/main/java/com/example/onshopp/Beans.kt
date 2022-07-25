package com.example.onshopp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class Beans : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_beans)

        val bn = findViewById<Button>(R.id.bnbtn)
        bn.setOnClickListener {
            intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
            Toast.makeText(this,"Thank yo for purchasing Beans with us!", Toast.LENGTH_SHORT).show()
        }
    }
}
