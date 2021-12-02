package com.example.sns.login.ui

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.sns_super_android.R
import com.example.sns_super_android.sns.MainActivity
import com.example.sns_super_android.sns.Network.Request.LoginRequest
import com.example.sns_super_android.sns.login.data.LoginRepository
import com.example.sns_super_android.sns.login.data.SharedPref

class LoginActivity : AppCompatActivity() {
    private var tv_go_register : TextView? = null
    private var btn_login : Button? = null
    private var et_id : EditText? = null
    private var et_password : EditText? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        et_id = findViewById<View>(R.id.et_write_id) as EditText
        et_password = findViewById<View>(R.id.et_write_password) as EditText
        tv_go_register = findViewById<View>(R.id.tv_go_register) as TextView
        tv_go_register!!.setOnClickListener{
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }
        SharedPref.openSharedPrep(this)
        btn_login = findViewById<View>(R.id.btn_login) as Button
        btn_login!!.setOnClickListener{
            val id = et_id!!.text.toString().trim()
            val password = et_password!!.text.toString().trim()

            if (id.isEmpty()){
                et_id!!.error = "비어있음"
                et_id!!.requestFocus()
                return@setOnClickListener
            }
            if (password.isEmpty()){
                et_password!!.error = "비어있음"
                et_password!!.requestFocus()
                return@setOnClickListener
            }

             else {
//                val loginRequest = LoginRequest(id, password)
//                loginRequest.id
//                loginRequest.password
//                LoginRepository(loginRequest)
            }
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}

