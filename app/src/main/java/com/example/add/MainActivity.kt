package com.example.add


import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.*
import androidx.constraintlayout.widget.ConstraintLayout


class MainActivity : AppCompatActivity() {

    private var linearLayout: LinearLayout? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        linearLayout = findViewById(R.id.parent_linear_layout)


    }

    fun onDelete(view: View) {
        linearLayout!!.removeView(view.parent as View)
    }

    fun onAddField(view: View) {
        val inflater = getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val rowView:View = inflater.inflate(R.layout.prereq,null)
        linearLayout!!.addView(rowView, linearLayout!!.childCount-1)

    }
}








