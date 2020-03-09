package com.example.myapplication1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_friend.view.*

class FriendRecycleAdapter(val items:ArrayList<FriendItem>):
    RecyclerView.Adapter<FriendViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FriendViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.item_friend,parent,false)
        return FriendViewHolder(view)
    }

    override fun getItemCount(): Int {
        return items.count()
    }

    override fun onBindViewHolder(holder: FriendViewHolder, position: Int) {
        holder.containerView.name.text=items[position].name
        holder.containerView.message.text=items[position].message
    }
}
