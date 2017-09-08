package com.jackcheung.android.sample.navigationfragmentdemo.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.dmcapps.navigationfragment.v7.fragments.NavigationFragment
import com.jackcheung.android.sample.navigationfragmentdemo.R
import kotlinx.android.synthetic.main.fragment_second.*

/**
 * Created by jack.cheung on 8/9/2017.
 */
class SecondNavigationFragment: NavigationFragment() {
    companion object {
        @JvmStatic
        fun newInstance(): SecondNavigationFragment {
            return SecondNavigationFragment()
        }
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater?.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dismissButton.setOnClickListener {
            tappedDismissButton()
        }
    }

    protected fun tappedDismissButton() {
        dismissFragment()
    }
}