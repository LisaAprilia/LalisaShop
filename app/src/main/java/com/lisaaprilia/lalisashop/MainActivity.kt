package com.lisaaprilia.lalisashop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setContentView(R.layout.relative_layout)
        setContentView(R.layout.constraint_layout)
        setContentView(R.layout.belajar_linear_layout)
        setContentView(R.layout.belajar_constraint_layout)

    }
}