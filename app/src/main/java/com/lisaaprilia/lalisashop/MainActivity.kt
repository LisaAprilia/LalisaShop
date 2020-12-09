package com.lisaaprilia.lalisashop

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lbl_nama = findViewById<TextView>(R.id.lbl_nama)
        val lbl_followers= findViewById<TextView>(R.id.lbl_followers)
        val btn_follow = findViewById<Button>(R.id.btn_follow)
        var followers = 1000

        lbl_followers.text = followers.toString()
        btn_follow.setOnClickListener {
            followers++
            lbl_followers.text = followers.toString()
        }

    }
}