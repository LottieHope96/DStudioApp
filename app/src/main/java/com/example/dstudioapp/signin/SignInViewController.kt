package com.example.dstudioapp.signin

import com.example.dstudioapp.profile.ProfileFragment

class SignInViewController(val view: SignInView, val viewModel: SignInViewModel) {

    init {
        view.setSignInButtonClickListener { showProfileIfSuccessful() }
    }

    fun showProfileIfSuccessful() {
        val userEnteredDetails = view.getUserNameAndPassword()
        if(viewModel.checkUserDetailsAreCorrect(userEnteredDetails.first, userEnteredDetails.second)) {
            view.replaceFragmentWith(ProfileFragment(), ProfileFragment.FRAGMENT_TAG)
        }
    }

}