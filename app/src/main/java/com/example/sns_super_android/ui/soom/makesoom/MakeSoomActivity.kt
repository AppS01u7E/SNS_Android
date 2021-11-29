package com.example.sns_super_android.ui.soom.makesoom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sns_super_android.R
import kotlinx.android.synthetic.main.activity_make_soom.*

class MakeSoomActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_make_soom)

        make_soom_back.setOnClickListener {
            finish()
        }
    }
}