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
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import com.example.baseclassforactivityadapter_11_injava.activity.activity.DetailsActivity
import com.example.baseclassforactivityadapter_11_injava.activity.adapter.DetailsAdapter
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see [Testing documentation](http://d.android.com/tools/testing)
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        Assert.assertEquals(
            "com.example.baseclassforactivityadapter_11_injava",
            appContext.packageName
        )
    }
}