package com.airline.appextensions

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.view.View
import android.widget.Button

open class HomeActivity : AppCompatActivity(), View.OnClickListener {


    var btnTripList: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
//        Option#1 - This did not work
//        btnTripList = findViewById(R.id.btn_tripList)
//
//        btnTripList?.setOnClickListener(this)


// Option#2 - Works
        setLayOutListener(this.findViewById(R.id.layout_home))

//        Option#1 - This did not work
//        btnTripList?.setOnClickListener{
//            val snackBar = Snackbar.make(it,"TripListClicked", Snackbar.LENGTH_LONG)
//            snackBar.show()
//        }
    }

    // Option#2 - Works
    fun setLayOutListener(view: View?){
       val finalView = view ?: this.findViewById(R.id.layout_home)

        finalView?.let {
            btnTripList = it.findViewById(R.id.btn_tripList)
            btnTripList?.setOnClickListener(this)
      }
    }


    // Option#2 - Works

    override fun onClick(view: View?) {
        when(view?.id) {

            R.id.btn_tripList -> {
                val snackBar = Snackbar.make(view,"TripList Clicked", Snackbar.LENGTH_LONG)
                snackBar.show()
                return
            }
        }
    }
}
