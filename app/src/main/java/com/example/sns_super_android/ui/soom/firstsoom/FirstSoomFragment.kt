package com.example.sns_super_android.ui.soom.firstsoom

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.sns_super_android.R

class FirstSoomFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootview:View =  inflater.inflate(R.layout.fragment_first_soom, container, false)



        return rootview
    }

    companion object {
    }
}