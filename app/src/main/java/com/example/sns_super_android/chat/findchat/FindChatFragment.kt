package com.example.sns_super_android.chat.findchat

import android.animation.ObjectAnimator
import android.content.ContentValues.TAG
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.core.widget.addTextChangedListener
import com.example.sns_super_android.R
import com.example.sns_super_android.chat.mainchat.ChatFragment
import com.example.sns_super_android.soom.findsoom.FindSoomFragment
import com.google.android.material.floatingactionbutton.FloatingActionButton
import kotlinx.android.synthetic.main.fragment_find_chat.*
import org.w3c.dom.Text

class FindChatFragment : Fragment() {

    private var isFabOpen = false

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootview : View = inflater.inflate(R.layout.fragment_find_chat,container,false)


        val findchat_edit:EditText = rootview.findViewById(R.id.findchat_edit)
        val findchat_Xbtn:ImageButton = rootview.findViewById(R.id.findchat_Xbtn)
        val findchat_Seachbtn:ImageButton = rootview.findViewById(R.id.findchat_Searchbtn)
        val findchat_fab1 : FloatingActionButton = rootview.findViewById(R.id.findchat_fab1)


        findchat_edit.addTextChangedListener(object : TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if(findchat_edit.length()>=1){
                    findchat_Xbtn.visibility = View.VISIBLE
                }
                else{
                    findchat_Xbtn.visibility = View.INVISIBLE
                }
                if(findchat_edit.length()>=25){
                    Toast.makeText(activity,"채팅 제목은 최대 25자 입니다",Toast.LENGTH_SHORT).show()
                }
            }

            override fun afterTextChanged(s: Editable?) {
            }

        })

        findchat_Xbtn.setOnClickListener {
            findchat_edit.setText("")
            Log.d(TAG, "onCreateView: X")
        }

        findchat_fab1.setOnClickListener {
            val transaction = activity?.supportFragmentManager?.beginTransaction()
            transaction?.replace(R.id.main, ChatFragment())?.commit()
        }

        return rootview
    }

    companion object {

    }

}