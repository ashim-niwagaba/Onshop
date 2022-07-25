package com.example.onshopp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class wheat : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wheat)
        val wt = findViewById<Button>(R.id.wtbtn)
        wt.setOnClickListener {
            intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
            Toast.makeText(this,"Thank yo for purchasing Wheat with us!",Toast.LENGTH_SHORT).show()
        }
    }
}
