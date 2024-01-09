package com.example.tuan312

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.example.tuan3.R

class tuan312MainActivity : AppCompatActivity() {
    var adap:tuan312adapter? =null

    var ls: ArrayList<tuan312_contact> = ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tuan312_main)
        var lv=findViewById<ListView>(R.id.tuan312lv)
        ls.add(tuan312_contact("pham ngoc binh", "18",R.drawable.android))
                ls.add(tuan312_contact("pham ngoc A", "5",R.drawable.firefox))
                ls.add(tuan312_contact("pham ngoc C", "16",R.drawable.chrome))
                ls.add(tuan312_contact("pham ngoc D", "17",R.drawable.dell))
                ls.add(tuan312_contact("pham Van a", "14",R.drawable.apple))
        adap=tuan312adapter(this,ls)
        lv.adapter=adap
    }
}