package com.example.berkayyalcinhomework2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class LoginActivity : AppCompatActivity() {

    private lateinit var ivChangePasswordVisibility: ImageView
    private var isVisibilityOn = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        ivChangePasswordVisibility  = findViewById(R.id.ivShowPassword)

        ivChangePasswordVisibility.setOnClickListener {
            if (isVisibilityOn) {
                ivChangePasswordVisibility.setImageResource(R.drawable.ic_baseline_visibility_24)
                isVisibilityOn = false
            } else {
                ivChangePasswordVisibility.setImageResource(R.drawable.ic_baseline_visibility_off_24)
                isVisibilityOn = true
            }
        }
    }
    fun onClickSignup(view: View){

        val Signupintent  = Intent(applicationContext,SignupActivity::class.java)
        startActivity(Signupintent)
    }
}