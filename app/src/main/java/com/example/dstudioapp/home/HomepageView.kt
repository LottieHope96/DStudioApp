package com.example.dstudioapp.home

import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import androidx.fragment.app.findFragment
import com.example.dstudioapp.R

class HomepageView(val view: View) {

    private val skipBtn = view.findViewById<TextView>(R.id.skip_now_button)
    private val nextBtn = view.findViewById<Button>(R.id.next_button)


    fun setSkipClickListener(action: () -> (Unit)) {
        skipBtn.setOnClickListener { action.invoke() }
    }

    fun setNextBtnClickListener(action: () -> (Unit)) {
        nextBtn.setOnClickListener { action.invoke() }
    }

    fun replaceFragmentWith(fragment: Fragment, tag: String, addToBackStack: Boolean = true) {
        val fragmentManager = view.findFragment<HomepageFragment>().parentFragmentManager
            val transaction: FragmentTransaction = fragmentManager.beginTransaction()
            transaction.replace(R.id.content_container, fragment, tag)
            if (addToBackStack) {
                transaction.addToBackStack(null)
            }
            transaction.commit()
    }

}