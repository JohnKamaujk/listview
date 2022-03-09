package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listview=findViewById<ListView>(R.id.listview)
        val names= arrayOf("John","Erick","Queen","Limo","Adrian","Evans","Peter")
        val arrayAdapter:ArrayAdapter<String> = ArrayAdapter(this,android.R.layout.simple_list_item_1,names)
        listview.adapter=arrayAdapter
        
        listview.setOnItemClickListener { adapterView, view, position, id ->
            Toast.makeText(this,"You have picked name  "+ names[position],Toast.LENGTH_LONG).show()
        }
    }
}