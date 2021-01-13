package com.example.dstudioapp.signin

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.dstudioapp.R
import com.example.dstudioapp.services.SignInService

class SignInFragment: Fragment() {

    companion object {
        const val FRAGMENT_TAG = "SignInFragment"
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val signInView = SignInView(view)
        val viewModel = SignInViewModel(SignInService())
        val controller = SignInViewController(signInView, viewModel)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_sign_in, container, false)
    }


}