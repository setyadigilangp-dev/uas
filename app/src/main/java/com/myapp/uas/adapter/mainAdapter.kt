package com.myapp.uas.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.myapp.uas.R
import com.myapp.uas.data.user
import kotlinx.android.synthetic.main.item_main.view.*

class mainAdapter(private val list: List<user>) : RecyclerView.Adapter<mainAdapter.ViewHolder>() {

    var onItemClickListener: ((user) -> Unit)? = null

    inner class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){

        fun bind(user: user){
            with(itemView){
                Glide.with(this).load(user.avatarUrl).into(itemAvatar)
                itemLogin.text = user.login
                itemDescription.text = user.htmlUrl
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_main, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       holder.bind(list.get(position))
        holder.itemView.setOnClickListener{
            onItemClickListener?.invoke(list[position])
        }
    }
}