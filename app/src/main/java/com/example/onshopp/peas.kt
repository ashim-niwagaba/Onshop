package com.example.onshopp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class peas : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_peas)

        val ps = findViewById<Button>(R.id.psbtn)
        ps.setOnClickListener {
            intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
            Toast.makeText(this,"Thank yo for purchasing Peas with us!", Toast.LENGTH_SHORT).show()
        }
    }
}
