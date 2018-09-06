package com.airline.appextensions

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.widget.Button

open class HomeActivity : AppCompatActivity() {

    var btnTripList: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        btnTripList = findViewById(R.id.btn_tripList)

        btnTripList?.setOnClickListener{
            val snackBar = Snackbar.make(it,"TripListClicked", Snackbar.LENGTH_LONG)
            snackBar.show()
        }
    }
}
