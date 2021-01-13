package com.example.dstudioapp.profile

class ProfileViewController(val view: ProfileView, val viewModel: ProfileViewModel) {

    init {
        view.setProfessionalView()
        view.setBack()
    }


}