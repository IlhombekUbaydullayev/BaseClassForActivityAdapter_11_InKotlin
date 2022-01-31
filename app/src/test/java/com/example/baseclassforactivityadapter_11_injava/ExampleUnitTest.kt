package com.example.baseclassforactivityadapter_11_injava

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
import org.junit.Assert
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see [Testing documentation](http://d.android.com/tools/testing)
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        Assert.assertEquals(4, (2 + 2).toLong())
    }
}