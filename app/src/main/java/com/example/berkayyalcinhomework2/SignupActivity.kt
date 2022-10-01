package com.example.berkayyalcinhomework2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class SignupActivity : AppCompatActivity() {

    private lateinit var ivSignChangePasswordVisibility: ImageView
    private var isSignVisibilityOn = false


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup_activity)

        ivSignChangePasswordVisibility  = findViewById(R.id.ivSignShowPassword)

        ivSignChangePasswordVisibility.setOnClickListener {
            if (isSignVisibilityOn) {
                ivSignChangePasswordVisibility.setImageResource(R.drawable.ic_baseline_visibility_24)
                isSignVisibilityOn = false
            } else {
                ivSignChangePasswordVisibility.setImageResource(R.drawable.ic_baseline_visibility_off_24)
                isSignVisibilityOn = true
            }
        }


    }

    fun onClickButtonBack(view: View){

        val Loginintent  = Intent(applicationContext,LoginActivity::class.java)
        startActivity(Loginintent)
    }

}