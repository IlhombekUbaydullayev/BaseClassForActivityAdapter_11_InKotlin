package com.example.baseclassforactivityadapter_11_injava.activity.network


interface BaseServer {
    companion object {
        const val IS_TESTER = true
        const val SERVER_DEVELOPMENT: String = "http://dev.mysite.com"
        const val SERVER_DEPLOYMENT: String = "http://my.mysite.com"
    }
}