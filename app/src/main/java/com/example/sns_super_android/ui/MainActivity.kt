package com.example.sns_super_android.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sns_super_android.R
import com.example.sns_super_android.ui.chat.mainchat.ChatFragment
import com.example.sns_super_android.ui.soom.mainsoom.SoomFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        chatBtn.setOnClickListener {
            tran(1)
        }
        soomBtn.setOnClickListener {
            tran(2)
        }
    }

    private fun tran(num:Int){
        val transaction = supportFragmentManager.beginTransaction()
        when(num){
            1->{
                transaction.replace(R.id.main,ChatFragment()).commit()
            }
            2->{
                transaction.replace(R.id.main, SoomFragment()).commit()
            }
        }
    }

}