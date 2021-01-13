package com.example.dstudioapp.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.dstudioapp.R
import com.example.dstudioapp.services.SignInService

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val mainViewModel = MainViewModel()
        val controller = MainViewController(mainViewModel, this)
        supportActionBar?.hide()
    }

    fun addFragmentToStack(fragment: Fragment, tag: String) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.content_container, fragment, tag).commit()
    }

}

enum class AppEvent {
    HOMEPAGE,
    SIGN_IN,
    PROFILE,
    SKIP_SIGN_IN
}