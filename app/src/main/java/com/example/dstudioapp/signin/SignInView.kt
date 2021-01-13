package com.example.dstudioapp.signin

import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import androidx.fragment.app.findFragment
import com.example.dstudioapp.R
import com.example.dstudioapp.home.HomepageFragment

class SignInView(val view: View) {

    private val signInButton = view.findViewById<TextView>(R.id.sign_in_btn)
    private val userNameText = view.findViewById<TextView>(R.id.username_box)
    private val passwordText = view.findViewById<TextView>(R.id.password_box)

    fun setSignInButtonClickListener(action: () -> (Unit)) {
        signInButton.setOnClickListener{
            action.invoke()
        }
    }

    fun replaceFragmentWith(fragment: Fragment, tag: String, addToBackStack: Boolean = true) {
        val fragmentManager = view.findFragment<SignInFragment>().parentFragmentManager
        val transaction: FragmentTransaction = fragmentManager.beginTransaction()
        transaction.replace(R.id.content_container, fragment, tag)
        if (addToBackStack) {
            transaction.addToBackStack(null)
        }
        transaction.commit()
    }

    fun getUserNameAndPassword(): Pair<String, String> {
        return Pair(userNameText.text.toString(), passwordText.text.toString())
    }

}