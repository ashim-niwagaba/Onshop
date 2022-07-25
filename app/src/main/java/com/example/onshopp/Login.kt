package com.example.onshopp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_login.*

class Login : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val cmdlog = findViewById<Button>(R.id.logbtn)
        cmdlog.setOnClickListener {
            val em = findViewById<EditText>(R.id.email)
            val pass = findViewById<EditText>(R.id.password)

            var firebase = FirebaseAuth.getInstance()

            val y =firebase.signInWithEmailAndPassword(em.text.toString(),pass.text.toString())

            if(y.isComplete){
                val database = FirebaseDatabase.getInstance()

                intent= Intent(this,MainActivity::class.java)
                startActivity(intent)
                Toast.makeText(this, "you have successfully signedIn", Toast.LENGTH_LONG).show()

            }else{
                Toast.makeText(this, "Failed", Toast.LENGTH_LONG).show()
            }



        }
        val btnn = findViewById<TextView>(R.id.textView6)
        btnn.setOnClickListener{
            intent= Intent(this,register::class.java)
            startActivity(intent)
        }
        }



    }

