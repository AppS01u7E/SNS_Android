package com.example.sns_super_android.chat.mainchat

import android.animation.ObjectAnimator
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.sns_super_android.R
import com.example.sns_super_android.chat.findchat.FindChatFragment
import com.example.sns_super_android.soom.findsoom.FindSoomFragment
import com.google.android.material.floatingactionbutton.FloatingActionButton
import kotlinx.android.synthetic.main.fragment_chat.*
import kotlinx.android.synthetic.main.fragment_find_chat.*

class ChatFragment : Fragment() {

    private var isFabOpen = false

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootview:View = inflater.inflate(R.layout.fragment_chat, container, false)

        val chat_fab1 : FloatingActionButton = rootview.findViewById(R.id.chat_fab1)

        chat_fab1.setOnClickListener {
            val transaction = activity?.supportFragmentManager?.beginTransaction()
            transaction?.replace(R.id.main, FindChatFragment())?.commit()
        }

        return rootview
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

    }



    companion object {
    }
}