package com.airline.appextensions

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button

import kotlinx.android.synthetic.main.activity_xhome.*

class XHomeActivity : HomeActivity() {


    var btnMyMiles: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_xhome)
        btnMyMiles = findViewById(R.id.btn_myloyalty)
        btnMyMiles?.setOnClickListener(this)

//                Option#1 - This did not work
//        btnMyMiles?.setOnClickListener{
//            val snackBar = Snackbar.make(it,"MyMiles Clicked", Snackbar.LENGTH_LONG)
//            snackBar.show()
//        }

//                   Option#2 - Works
        val includedLayout = this.findViewById<View>(R.id.layout_home_view)
        setLayOutListener(includedLayout)

//                       Option#3 - This did not work
//        includedLayout.setOnClickListener {
//            super.onClick(it)
//        }

//                        Option#4 - Works, but whats the point 😟
//        val btnTrips = includedLayout.findViewById<Button>(R.id.btn_tripList)

//        btnTrips?.setOnClickListener{
//            val snackBar = Snackbar.make(it,"TripList Clicked", Snackbar.LENGTH_LONG)
//            snackBar.show()
//        }

    }


    override fun onClick(view: View?) {
        super.onClick(view)
        when(view?.id) {

            R.id.btn_myloyalty -> {
                val snackBar = Snackbar.make(view,"My Miles Clicked", Snackbar.LENGTH_LONG)
                snackBar.show()
                return
            }
        }
    }

}
