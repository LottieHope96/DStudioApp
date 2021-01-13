package com.example.dstudioapp.services

//mocked for simplicity
class SignInService {

    private var isSignedIn = false

    fun isUserSignedIn(): Boolean {
        return isSignedIn
    }

    fun wasSignInSuccessful(userName: String, password: String): Boolean {
        isSignedIn = true
        return true
    }

}
