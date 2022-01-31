package com.example.baseclassforactivityadapter_11_injava.activity.activity


import com.example.baseclassforactivityadapter_11_injava.activity.network.BaseServer
import androidx.appcompat.app.AppCompatActivity
import com.example.baseclassforactivityadapter_11_injava.activity.model.Member
import java.util.ArrayList

open class BaseActivity : AppCompatActivity(), BaseServer {

    protected fun getServer(): String? {
        return if (BaseServer.IS_TESTER) {
            BaseServer.SERVER_DEVELOPMENT
        } else BaseServer.SERVER_DEPLOYMENT
    }

    protected fun prepareMemberList(): List<Member> {
        val members = ArrayList<Member>()
        for (i in 0..29) {
            members.add(Member("Ilhombek $i", "Ubaydullayev $i"))
        }
        return members
    }


    companion object {
        protected fun isEmpty(s: String?): Boolean {
            return s == null || s.trim().isEmpty()
        }
    }
}