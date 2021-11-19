package com.example.sns_super_android.soom.findsoom

import android.animation.ObjectAnimator
import android.content.ContentValues
import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast
import com.example.sns_super_android.R
import com.example.sns_super_android.soom.mainsoom.SoomFragment
import com.example.sns_super_android.soom.makesoom.MakeSoomActivity
import com.example.sns_super_android.soom.writesoom.WriteSoomActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton
import kotlinx.android.synthetic.main.fragment_find_chat.*
import kotlinx.android.synthetic.main.fragment_find_soom.*


class FindSoomFragment : Fragment() {

    private val TAG = "FindSoomFragment"
    var isFabOpen = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootview : View =  inflater.inflate(R.layout.fragment_find_soom, container, false)

        val findsoom_fab1:FloatingActionButton = rootview.findViewById(R.id.findsoom_fab1)
        val findsoom_fab2:FloatingActionButton = rootview.findViewById(R.id.findsoom_fab2)
        val findsoom_fab3:FloatingActionButton = rootview.findViewById(R.id.findsoom_fab3)
        val findsoom_fab4:FloatingActionButton = rootview.findViewById(R.id.findsoom_fab4)
        val findsoom_edit:EditText = rootview.findViewById(R.id.findsoom_edit)
        val findsoom_Xbtn:ImageButton = rootview.findViewById(R.id.findsoom_Xbtn)
        val findsoom_Search:ImageButton = rootview.findViewById(R.id.findsoom_Search)


        findsoom_edit.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if(findsoom_edit.length()>=1){
                    findsoom_Xbtn.visibility = View.VISIBLE
                }
                else{
                    findsoom_Xbtn.visibility = View.INVISIBLE
                }
                if(findsoom_edit.length()>=25){
                    Toast.makeText(activity,"채팅 제목은 최대 25자 입니다", Toast.LENGTH_SHORT).show()
                }
            }

            override fun afterTextChanged(s: Editable?) {
            }

        })

        findsoom_Xbtn.setOnClickListener {
            findsoom_edit.setText("")
        }

        findsoom_fab1.setOnClickListener {
            toggleFab()
        }

        findsoom_fab2.setOnClickListener {
            val transaction = activity?.supportFragmentManager?.beginTransaction()
            transaction?.replace(R.id.main,SoomFragment())?.commit()
        }

        findsoom_fab3.setOnClickListener {
            startActivity(Intent(activity,WriteSoomActivity::class.java))
        }

        findsoom_fab4.setOnClickListener {
            startActivity(Intent(activity,MakeSoomActivity::class.java))
        }

        return rootview
    }

    private fun toggleFab(){

        isFabOpen = if(isFabOpen){
            ObjectAnimator.ofFloat(findsoom_fab2,"translationY",0f).apply { start() }
            ObjectAnimator.ofFloat(findsoom_fab3,"translationY",0f).apply { start() }
            ObjectAnimator.ofFloat(findsoom_fab4,"translationY",0f).apply { start() }
            findsoom_fab1.setImageResource(R.drawable.findchatmenuxml)
            false
        }else{
            ObjectAnimator.ofFloat(findsoom_fab2,"translationY",-200f).apply { start() }
            ObjectAnimator.ofFloat(findsoom_fab3,"translationY",-400f).apply { start() }
            ObjectAnimator.ofFloat(findsoom_fab4,"translationY",-600f).apply { start() }
            findsoom_fab1.setImageResource(R.drawable.bigx)
            true
        }
    }

    companion object {

    }
}