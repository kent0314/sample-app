package com.alekusa.sample_app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.alekusa.sample_app.adapters.ListRecyclerViewAdapter

class ListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)
        this.createRecyclerView()
    }

    private fun createRecyclerView() {
        val recyclerView = this.findViewById<RecyclerView>(R.id.ListRecyclerViewID)
        val adapter = ListRecyclerViewAdapter(this)

        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)
    }
}
