package com.rohindh.smoosh.controller

import android.content.Intent
//import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rohindh.smoosh.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getStartedBtn.setOnClickListener {
            val leagueIntent= Intent(this, GenderActivity::class.java)
            startActivity(leagueIntent)
        }
    }
}