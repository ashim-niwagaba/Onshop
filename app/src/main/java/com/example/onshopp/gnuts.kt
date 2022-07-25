package com.example.onshopp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class gnuts : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gnuts)

        val gn = findViewById<Button>(R.id.gnbtn)
        gn.setOnClickListener {
            intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
            Toast.makeText(this,"Thank yo for purchasing Ground Nuts with us!", Toast.LENGTH_SHORT).show()
        }
    }
}
