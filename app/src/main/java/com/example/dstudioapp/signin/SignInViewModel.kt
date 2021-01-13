package com.example.dstudioapp.signin

import androidx.lifecycle.ViewModel
import com.example.dstudioapp.services.SignInService

class SignInViewModel(private val signInService: SignInService): ViewModel() {

    fun checkUserDetailsAreCorrect(name: String, password: String): Boolean {
        return signInService.wasSignInSuccessful(name, password)
    }

}