package com.example.dstudioapp.main

import androidx.fragment.app.Fragment
import com.example.dstudioapp.profile.ProfileFragment
import com.example.dstudioapp.home.HomepageFragment
import com.example.dstudioapp.loggedout.LoggedOutFragment
import com.example.dstudioapp.signin.SignInFragment

class MainViewController(private val viewModel: MainViewModel, private val mainActivity: MainActivity) {

    init {
        initialiseStartScreen()
    }

    private fun initialiseStartScreen() {
        getHomepageFragment().let { mainActivity.addFragmentToStack(it.first, it.second) }
    }

    private fun getHomepageFragment(): Pair<Fragment, String> {
        return Pair(HomepageFragment(), HomepageFragment.FRAGMENT_TAG)
    }

}