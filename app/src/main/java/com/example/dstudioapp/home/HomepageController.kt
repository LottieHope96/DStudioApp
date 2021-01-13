package com.example.dstudioapp.home

import com.example.dstudioapp.loggedout.LoggedOutFragment
import com.example.dstudioapp.profile.ProfileFragment
import com.example.dstudioapp.signin.SignInFragment

class HomepageController(val view: HomepageView, val viewModel: HomepageViewModel) {

    init {
        view.setNextBtnClickListener { handleNextEvent() }
        view.setSkipClickListener { handleSkipEvent() }
    }

    private fun handleSkipEvent() {
        view.replaceFragmentWith(LoggedOutFragment(), LoggedOutFragment.FRAGMENT_TAG)
    }

    private fun handleNextEvent() {
        if(viewModel.isSignedIn()) {
            view.replaceFragmentWith(ProfileFragment(), ProfileFragment.FRAGMENT_TAG)
        } else {
            view.replaceFragmentWith(SignInFragment(), SignInFragment.FRAGMENT_TAG)
        }
    }

}