package com.example.sns_super_android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sns_super_android.chat.findchat.FindChatFragment
import com.example.sns_super_android.chat.mainchat.ChatFragment
import com.example.sns_super_android.chat.makechat.MakeChatActivity
import com.example.sns_super_android.mypage.MyPageFragment
import com.example.sns_super_android.soom.SoomFragment
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
        mypageBtn.setOnClickListener {
            tran(3)
        }
    }

    private fun tran(num:Int){
        val transaction = supportFragmentManager.beginTransaction()
        when(num){
            1->{
                transaction.replace(R.id.main,FindChatFragment()).commit()
            }
            2->{
                transaction.replace(R.id.main,SoomFragment()).commit()
            }
            3->{
                transaction.replace(R.id.main,MyPageFragment()).commit()
            }
        }
    }

}