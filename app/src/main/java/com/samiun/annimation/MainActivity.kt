package com.samiun.annimation

import android.animation.ObjectAnimator
import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var buttonOne:Button
    private lateinit var buttonTwo: Button
    private lateinit var starImage: ImageView
    private lateinit var sampleTextView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonOne= findViewById(R.id.button)
        buttonTwo = findViewById(R.id.button2)
        starImage = findViewById(R.id.imageView2)
        sampleTextView = findViewById(R.id.textView2)

        buttonOne.setOnClickListener {
            Toast.makeText(this, "Button one was clicked", Toast.LENGTH_SHORT).show()
            val animation = ObjectAnimator.ofFloat(starImage, View.ROTATION,0f,360f)
            animation.duration = 4000
            animation.repeatCount =1
            //animation.repeatMode = ObjectAnimator.REVERSE
            animation.start()
      }

        buttonTwo.setOnClickListener {
            Toast.makeText(this, "Button two was clicked", Toast.LENGTH_SHORT).show()
            val animation = AnimationUtils.loadAnimation(this,R.anim.rotation)
            sampleTextView.startAnimation(animation)
        }

    }
}