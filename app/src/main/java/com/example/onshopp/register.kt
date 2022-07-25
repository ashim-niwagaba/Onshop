package com.example.onshopp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_login.*
import com.google.firebase.database.FirebaseDatabase
class register : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        val cmdsignup = findViewById<Button>(R.id.cmdbtn)
        cmdsignup.setOnClickListener {
            val user_name = findViewById<EditText>(R.id.txtusername)
            val user_email = findViewById<EditText>(R.id.txtemail)
            val user_contact = findViewById<EditText>(R.id.txtcontact)
            val user_pwd = findViewById<EditText>(R.id.txtpass)
            var firebase = FirebaseAuth.getInstance()
            val f = firebase.currentUser!!.uid
            val y =firebase.createUserWithEmailAndPassword(user_email.text.toString(),user_pwd.text.toString())

            if(y.isComplete){

                val database = FirebaseDatabase.getInstance("https://onshopp-b6af1-default-rtdb.firebaseio.com/")
                database.getReference("users/$f").setValue(users(user_name.text.toString(),user_email.text.toString(),user_contact.text.toString(),user_pwd.text.toString()))
                intent= Intent(this,MainActivity::class.java)
                startActivity(intent)
                Toast.makeText(this, "you have successfully signed up", Toast.LENGTH_LONG).show()

            }else{

                Toast.makeText(this, "Failed", Toast.LENGTH_LONG).show()
        }



        }
        val btnn = findViewById<TextView>(R.id.textView2)
        btnn.setOnClickListener{
            intent= Intent(this,Login::class.java)
            startActivity(intent)
    }


    }

}


