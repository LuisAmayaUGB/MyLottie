package com.example.mylottie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.airbnb.lottie.LottieDrawable
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupAnim()



    }


    private fun setupAnim() {
        animation_view.setAnimation(R.raw.ejemplo)
        animation_view.repeatCount = LottieDrawable.INFINITE
        animation_view.speed = 5.0F //opcional
        animation_view.repeatCount = 5 //opcional

        animation_view.playAnimation()
    }



}