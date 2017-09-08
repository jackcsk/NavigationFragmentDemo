package com.jackcheung.android.sample.navigationfragmentdemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.dmcapps.navigationfragment.v7.StackNavigationManagerFragment
import com.jackcheung.android.sample.navigationfragmentdemo.fragments.PrimaryNavigationFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initNavigationFragment()
    }

    protected fun initNavigationFragment() {
        val primaryNavigationFragment = PrimaryNavigationFragment.newInstance()
        val stackNavigationFragmentManager = StackNavigationManagerFragment.newInstance(primaryNavigationFragment)
        supportFragmentManager.beginTransaction()
                .add(R.id.contentView, stackNavigationFragmentManager)
                .commit()
    }
}
