package com.example.baseclassforactivityadapter_11_injava.activity.activity

import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import com.example.baseclassforactivityadapter_11_injava.activity.network.BaseServer
import android.view.ViewGroup
import com.example.baseclassforactivityadapter_11_injava.activity.activity.MainActivity
import android.view.LayoutInflater
import com.example.baseclassforactivityadapter_11_injava.R
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.baseclassforactivityadapter_11_injava.activity.activity.BaseActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.baseclassforactivityadapter_11_injava.activity.adapter.MainAdapter
import android.content.Intent
import com.example.baseclassforactivityadapter_11_injava.activity.activity.DetailsActivity
import com.example.baseclassforactivityadapter_11_injava.activity.adapter.DetailsAdapter
import com.example.baseclassforactivityadapter_11_injava.activity.model.Member

class DetailsActivity : BaseActivity() {
    private var context: Context? = null
    private var recyclerView: RecyclerView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
        val members = prepareMemberList()
        refreshAdapter(members)
    }

    private fun initViews() {
        context = this
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView!!.layoutManager = GridLayoutManager(context, 1)
    }

    private fun refreshAdapter(members: List<Member>) {
        val adapter = DetailsAdapter(context, members)
        recyclerView!!.adapter = adapter
    }
}