package com.jackcheung.android.sample.navigationfragment_202

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.github.dmcapps.navigationfragment.v7.StackNavigationManagerFragment
import com.jackcheung.android.sample.navigationfragment_202.fragments.PrimaryNavigationFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initNavigationFragment()
    }

    protected fun initNavigationFragment() {
        val primaryNavigationFragment = PrimaryNavigationFragment.newInstance()
        val stackNavigationFragmentManager = StackNavigationManagerFragment.newInstance(primaryNavigationFragment)
        stackNavigationFragmentManager.navigationManager.setDefaultPresentAnimations(
                com.github.dmcapps.navigationfragment.R.anim.slide_in_from_right,
                com.github.dmcapps.navigationfragment.R.anim.slide_out_to_left
        )
        stackNavigationFragmentManager.navigationManager.setDefaultDismissAnimations(
                com.github.dmcapps.navigationfragment.R.anim.slide_in_from_left,
                com.github.dmcapps.navigationfragment.R.anim.slide_out_to_right
        )
        supportFragmentManager.beginTransaction()
                .add(R.id.contentView, stackNavigationFragmentManager)
                .commit()
    }
}
