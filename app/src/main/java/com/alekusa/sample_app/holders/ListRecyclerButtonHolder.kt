package com.alekusa.sample_app.holders

import android.view.View
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import com.alekusa.sample_app.R

class ListRecyclerButtonHolder(view: View): RecyclerView.ViewHolder(view) {
    val button = view.findViewById<Button>(R.id.RecyclerButtonID)
}