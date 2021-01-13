package com.example.dstudioapp.profile

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.findFragment
import com.example.dstudioapp.R

class ProfileView(val view: View) {

    private val professionalStep = view.findViewById<ConstraintLayout>(R.id.professional_step)
    private val backButton = view.findViewById<TextView>(R.id.back_button)

    fun setProfessionalView() {
        val bg = professionalStep.findViewById<ImageView>(R.id.step_background)
        bg.setImageResource(R.drawable.rounded_background_orange)
        professionalStep.findViewById<TextView>(R.id.step_title).text = view.context.getString(R.string.professional_title)
        professionalStep.findViewById<TextView>(R.id.step_steps_left).text = view.context.getString(R.string.four_steps_left)
        val icon = professionalStep.findViewById<ImageView>(R.id.step_icon)
        icon.setImageResource(R.drawable.breifcase)
    }

    fun setBack() {
        backButton.setOnClickListener {
            view.findFragment<ProfileFragment>().activity?.onBackPressed()
        }
    }

}