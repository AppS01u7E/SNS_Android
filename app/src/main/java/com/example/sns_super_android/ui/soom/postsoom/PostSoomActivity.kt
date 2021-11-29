package com.example.sns_super_android.ui.soom.postsoom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sns_super_android.R
import kotlinx.android.synthetic.main.activity_post_soom.*

class PostSoomActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_post_soom)

        post_soom_back.setOnClickListener {
            finish()
        }
    }
}