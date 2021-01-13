package com.example.dstudioapp.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.dstudioapp.R
import com.example.dstudioapp.services.SignInService

class HomepageFragment : Fragment() {

    companion object {
        const val FRAGMENT_TAG = "HomepageFragment"
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val signInService = SignInService()
        val viewModel = HomepageViewModel(signInService)
        val viewHolder = HomepageView(view)
        val controller = HomepageController(viewHolder, viewModel)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_homepage, container, false)
    }
}