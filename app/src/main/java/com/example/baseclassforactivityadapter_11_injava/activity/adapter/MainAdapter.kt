package com.example.baseclassforactivityadapter_11_injava.activity.adapter

import androidx.recyclerview.widget.RecyclerView
import android.view.ViewGroup
import com.example.baseclassforactivityadapter_11_injava.activity.activity.MainActivity
import android.view.LayoutInflater
import com.example.baseclassforactivityadapter_11_injava.R
import android.widget.LinearLayout
import android.widget.TextView
import android.view.View
import com.example.baseclassforactivityadapter_11_injava.activity.model.Member

class MainAdapter(private val activity: MainActivity, private val members: List<Member>) :
    BaseAdapter() {
    override fun getItemCount(): Int {
        return members.size
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.item_custom_layout, viewGroup, false)
        return CustomViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val member = members.get(position)
        if (holder is CustomViewHolder) {
            val lay_click = holder.lay_click
            val first_name = holder.first_name
            val last_name = holder.last_name

            first_name.text = member.firstName
            last_name.text = member.lastName

            lay_click.setOnClickListener {
                activity.openItemDetails(member)
            }
        }
    }

    class CustomViewHolder(view: View) : RecyclerView.ViewHolder(view){
           val lay_click = view.findViewById<LinearLayout>(R.id.lay_click)
           val first_name = view.findViewById<TextView>(R.id.first_name)
           val last_name = view.findViewById<TextView>(R.id.last_name)
    }
}