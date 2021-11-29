package com.example.sns_super_android.ui.soom.mainsoom

import android.animation.ObjectAnimator
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.sns_super_android.R
import com.example.sns_super_android.ui.soom.findsoom.FindSoomFragment
import com.example.sns_super_android.ui.soom.makesoom.MakeSoomActivity
import com.example.sns_super_android.ui.soom.postsoom.PostSoomActivity
import com.example.sns_super_android.ui.soom.writesoom.WriteSoomActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton
import kotlinx.android.synthetic.main.fragment_soom.*

class SoomFragment : Fragment() {


    var isFabOpen = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootview:View =  inflater.inflate(R.layout.fragment_soom, container, false)

        val soom_fab1 : FloatingActionButton = rootview.findViewById(R.id.soom_fab1)
        val soom_fab2 : FloatingActionButton = rootview.findViewById(R.id.soom_fab2)
        val soom_fab3 : FloatingActionButton = rootview.findViewById(R.id.soom_fab3)
        val soom_fab4 : FloatingActionButton = rootview.findViewById(R.id.soom_fab4)
        val soomPostBtn : Button = rootview.findViewById(R.id.soomPostBtn)

        soom_fab1.setOnClickListener {
            toggleFab()
        }
        soom_fab2.setOnClickListener {
            val transaction = activity?.supportFragmentManager?.beginTransaction()
            transaction?.replace(R.id.main,FindSoomFragment())?.commit()
        }
        soom_fab3.setOnClickListener {
            startActivity(Intent(activity,WriteSoomActivity::class.java))
        }
        soom_fab4.setOnClickListener {
            startActivity(Intent(activity,MakeSoomActivity::class.java))
        }
        soomPostBtn.setOnClickListener {
            startActivity(Intent(activity,PostSoomActivity::class.java))
        }

        return rootview
    }

    private fun toggleFab(){

        isFabOpen = if(isFabOpen){
            ObjectAnimator.ofFloat(soom_fab2,"translationY",0f).apply { start() }
            ObjectAnimator.ofFloat(soom_fab3,"translationY",0f).apply { start() }
            ObjectAnimator.ofFloat(soom_fab4,"translationY",0f).apply { start() }
            soom_fab1.setImageResource(R.drawable.findchatmenuxml)
            false
        }else{
            ObjectAnimator.ofFloat(soom_fab2,"translationY",-200f).apply { start() }
            ObjectAnimator.ofFloat(soom_fab3,"translationY",-400f).apply { start() }
            ObjectAnimator.ofFloat(soom_fab4,"translationY",-600f).apply { start() }
            soom_fab1.setImageResource(R.drawable.bigx)
            true
        }
    }

    companion object {

    }
}