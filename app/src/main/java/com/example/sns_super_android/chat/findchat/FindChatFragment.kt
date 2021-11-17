package com.example.sns_super_android.chat.findchat

import android.content.ContentValues.TAG
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast
import androidx.core.widget.addTextChangedListener
import com.example.sns_super_android.R
import kotlinx.android.synthetic.main.fragment_find_chat.*
import org.w3c.dom.Text

class FindChatFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootview : View = inflater.inflate(R.layout.fragment_find_chat,container,false)


        val findchat_edit:EditText = rootview.findViewById(R.id.findchat_edit)
        val findchat_Xbtn:ImageButton = rootview.findViewById(R.id.findchat_Xbtn)
        val findchat_Seachbtn:ImageButton = rootview.findViewById(R.id.findchat_Searchbtn)


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
                while (findchat_edit.length()>=25){
                    Toast.makeText(activity,"채팅 이름은 최대 25글자 입니다",Toast.LENGTH_SHORT).show()
                }
            }

            override fun afterTextChanged(s: Editable?) {
            }

        })

        findchat_Xbtn.setOnClickListener {
            findchat_edit.setText("")
        }

        return rootview
    }

    companion object {

    }
}