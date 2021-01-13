package com.example.dstudioapp.loggedout

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.dstudioapp.R

class LoggedOutFragment: Fragment() {

    companion object {
        const val FRAGMENT_TAG = "LoggedOutFragment"
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_logged_out, container, false)
    }

}