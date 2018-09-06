package com.airline.appextensions

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.widget.Button

import kotlinx.android.synthetic.main.activity_xhome.*

class XHomeActivity : HomeActivity() {


    var btnMyMiles: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_xhome)
        btnMyMiles = findViewById(R.id.btn_myloyalty)

        btnMyMiles?.setOnClickListener{
            val snackBar = Snackbar.make(it,"MyMiles Clicked", Snackbar.LENGTH_LONG)
            snackBar.show()
        }
    }

}
