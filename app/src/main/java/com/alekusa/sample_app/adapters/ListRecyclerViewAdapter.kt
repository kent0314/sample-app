package com.alekusa.sample_app.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.alekusa.sample_app.R
import com.alekusa.sample_app.holders.ListRecyclerButtonHolder
import com.alekusa.sample_app.holders.ListRecyclerViewHolder
import com.squareup.picasso.Picasso

class ListRecyclerViewAdapter(private val context: Context) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private val names = listOf("大塚", "Abe", "渋木")
    private val jobs = listOf("シェフ", "司会", "チームリーダー")
    private val imageUrls = listOf(
        "https://avatars3.githubusercontent.com/u/46307653?s=460&v=4",
        "https://avatars2.githubusercontent.com/u/31503306?s=460&v=4",
        "https://avatars2.githubusercontent.com/u/21360441?s=460&v=4"
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val layoutInflater = LayoutInflater.from(context)

        val itemView = layoutInflater.inflate(R.layout.list_recycler_item, parent, false)
        val itemHolder = ListRecyclerViewHolder(itemView)
        this.setImageView(viewType, itemHolder.imageView)

        val buttonView = layoutInflater.inflate(R.layout.list_recycler_button, parent, false)
        val buttonHolder = ListRecyclerButtonHolder(buttonView)

        if(viewType == 3) {
            return buttonHolder
        } else {
            itemHolder.titleTextView.text = this.names[viewType]
            itemHolder.subTitleTextView.text = this.jobs[viewType]
            return itemHolder
        }
    }

    override fun getItemViewType(position: Int): Int {
        return position
    }

    override fun getItemCount(): Int {
        return this.names.size + 1
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

    }

    private fun setImageView(viewType: Int, imageView: ImageView) {
        if(viewType != 3) {
            Picasso.get().load(this.imageUrls[viewType]).into(imageView)
        }
    }
}