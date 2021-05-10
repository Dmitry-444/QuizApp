package com.example.quizapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.davemorrissey.labs.subscaleview.ImageSource
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView
import kotlin.collections.ArrayList as ArrayList1


class InformationMenuActivity : AppCompatActivity() {

    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.information_menu_activity)

        val imageView = findViewById<View>(R.id.iv_title) as SubsamplingScaleImageView
        imageView.setImage(ImageSource.resource(R.drawable.ic_map_of_states))

        val btnToFragment = findViewById<Button>(R.id.btn_to_states)
        btnToFragment.setOnClickListener(){
            val intent = Intent(this, StatesActivity::class.java)
            startActivity(intent)
        }

    }
}