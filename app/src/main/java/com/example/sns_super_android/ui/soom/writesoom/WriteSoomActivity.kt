package com.example.sns_super_android.ui.soom.writesoom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sns_super_android.R
import kotlinx.android.synthetic.main.activity_write_soom.*

class WriteSoomActivity : AppCompatActivity(), WriteSoomContract.View{

    private var presenter : WriteSoomContract.Presenter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_write_soom)

        presenter = WriteSoomPresenter()

        write_soom_back.setOnClickListener {
            finish()
        }
    }
}