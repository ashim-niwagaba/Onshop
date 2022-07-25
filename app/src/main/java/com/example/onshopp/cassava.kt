package com.example.onshopp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class cassava : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cassava)
        val casavabtn = findViewById<Button>(R.id.csbtn)
        casavabtn.setOnClickListener {
            intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
            Toast.makeText(this,"Thank yo for purchasing Cassava-flour with us!", Toast.LENGTH_SHORT).show()
        }
    }
}
