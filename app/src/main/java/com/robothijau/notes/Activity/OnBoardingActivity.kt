package com.robothijau.notes.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.LinearLayout
import com.robothijau.notes.R

class OnBoardingActivity : AppCompatActivity() {

    private lateinit var myContainer: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_boarding)
        supportActionBar?.hide()

        myContainer = findViewById(R.id.myContainer)

        // Menampilkan kontainer dengan animasi saat activity dibuat
        showContainerWithAnimation()
    }

    private fun showContainerWithAnimation() {
        val animation: Animation = AnimationUtils.loadAnimation(this, R.anim.anim)
        myContainer.startAnimation(animation)

        // Mengatur visibilitas kontainer menjadi terlihat setelah animasi selesai
        animation.setAnimationListener(object : Animation.AnimationListener {
            override fun onAnimationStart(animation: Animation) {}

            override fun onAnimationEnd(animation: Animation) {
                myContainer.visibility = View.VISIBLE
            }

            override fun onAnimationRepeat(animation: Animation) {}
        })
    }
}
