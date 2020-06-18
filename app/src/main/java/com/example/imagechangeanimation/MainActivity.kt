package com.example.imagechangeanimation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val jerry_img = findViewById<ImageView>(R.id.jerry)
        val dora_img = findViewById<ImageView>(R.id.dora)
        var count =0

        jerry_img.setOnClickListener {
            if (count == 0) {
                jerry_img.animate().alpha(0F).setDuration(2000)
                dora_img.animate().alpha(1F).setDuration(2000)
                count = 1
            } else {
                dora_img.animate().alpha(0F).setDuration(2000)
                jerry_img.animate().alpha(1F).setDuration(2000)
//                jerry_img.animate().translationXBy(1000F).setDuration(2000)
                count = 0
            }
        }
    }
}
