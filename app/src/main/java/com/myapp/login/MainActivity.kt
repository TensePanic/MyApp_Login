package com.myapp.login

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.myapp.login.R.id
import com.myapp.login.R.layout
import com.myapp.loginverification.LoginVerification

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private val loginVerification = LoginVerification()

    private lateinit var email: EditText
    private lateinit var password: EditText
    private lateinit var login: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)

        email = findViewById(id.editTextTextEmailAddress)
        password = findViewById(id.editTextTextPassword)
        login = findViewById(R.id.buttonLogin)

        login.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (loginVerification.verify(email.text.toString(), password.text.toString())) {
            Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this, "Login Failed", Toast.LENGTH_SHORT).show()
        }
        //Toast.makeText(this, "Login pressed", Toast.LENGTH_SHORT).show()
    }
}