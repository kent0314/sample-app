package com.alekusa.sample_app.holders

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.alekusa.sample_app.R

class ListRecyclerViewHolder(view: View): RecyclerView.ViewHolder(view) {
    val imageView = view.findViewById<ImageView>(R.id.ImageViewID)
    val subTitleTextView = view.findViewById<TextView>(R.id.SubTitleViewID)
    val titleTextView = view.findViewById<TextView>(R.id.TitleViewID)
}