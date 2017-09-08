package com.jackcheung.android.sample.navigationfragmentdemo.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.dmcapps.navigationfragment.v7.fragments.NavigationFragment
import com.jackcheung.android.sample.navigationfragmentdemo.R
import kotlinx.android.synthetic.main.fragment_primary.*

/**
 * Created by jack.cheung on 8/9/2017.
 */
class PrimaryNavigationFragment: NavigationFragment() {
    companion object {
        @JvmStatic
        val TAG = PrimaryNavigationFragment::class.java.simpleName

        @JvmStatic
        fun newInstance(): PrimaryNavigationFragment {
            return PrimaryNavigationFragment()
        }
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater?.inflate(R.layout.fragment_primary, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        openFragmentButton.setOnClickListener {
            tappedOpenFragmentButton()
        }
    }

    override fun onPause() {
        Log.d(TAG, "onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.d(TAG, "onStop")
        super.onStop()
    }

    protected fun tappedOpenFragmentButton() {
        presentFragment(
                SecondNavigationFragment.newInstance()
        )
    }
}