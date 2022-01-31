package com.example.baseclassforactivityadapter_11_injava.activity.adapter

import androidx.recyclerview.widget.RecyclerView
import com.example.baseclassforactivityadapter_11_injava.activity.network.BaseServer
import android.view.ViewGroup


open class BaseAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>(), BaseServer {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {}
    override fun getItemCount(): Int {
        return 0
    }

    protected fun getServer(): String {
        return if (BaseServer.IS_TESTER) {
            BaseServer.SERVER_DEVELOPMENT
        } else BaseServer.SERVER_DEPLOYMENT
    }

    companion object {
        protected fun isEmpty(s: String?): Boolean {
            return s == null || s.trim().isEmpty()
        }
    }
}