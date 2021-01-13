package com.example.dstudioapp.home

import androidx.lifecycle.ViewModel
import com.example.dstudioapp.services.SignInService

class HomepageViewModel(private val signInService: SignInService): ViewModel() {

    fun isSignedIn(): Boolean = signInService.isUserSignedIn()

}