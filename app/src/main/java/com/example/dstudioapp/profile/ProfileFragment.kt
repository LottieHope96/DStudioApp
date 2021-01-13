package com.example.dstudioapp.profile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.dstudioapp.R

class ProfileFragment: Fragment() {

    companion object {
        const val FRAGMENT_TAG = "ProfileFragment"
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_profile, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val viewModel = ProfileViewModel()
        val viewHolder = ProfileView(view)
        val controller = ProfileViewController(viewHolder, viewModel)
    }

}