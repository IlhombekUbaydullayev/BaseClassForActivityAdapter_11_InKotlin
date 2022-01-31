package com.example.baseclassforactivityadapter_11_injava.activity.adapter

import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import android.view.ViewGroup
import android.view.LayoutInflater
import com.example.baseclassforactivityadapter_11_injava.R
import android.widget.LinearLayout
import android.widget.TextView
import android.view.View
import com.example.baseclassforactivityadapter_11_injava.activity.model.Member

class DetailsAdapter(private val context: Context?, private val members: List<Member>) :
    BaseAdapter() {
    override fun getItemCount(): Int {
        return members.size
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.item_layout_details, viewGroup, false)
        return CustomViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val member = members[position]
        if (holder is CustomViewHolder) {
            val first_name = holder.first_name
            val last_name = holder.last_name

            first_name.text = member.firstName
            last_name.text = member.lastName
        }
    }

    class CustomViewHolder(view: View) : RecyclerView.ViewHolder(view) {
           val lay_click = view.findViewById<LinearLayout>(R.id.lay_click)
           val first_name = view.findViewById<TextView>(R.id.first_name)
           val last_name = view.findViewById<TextView>(R.id.last_name)
    }
}