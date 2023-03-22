package com.example.assignment4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class bioString : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bio_string)
        val biography=findViewById<TextView>(R.id.realBio)
        val firstName=intent.getStringExtra("firstName")
        val lastName = intent.getStringExtra("lastName")
        val school=intent.getStringExtra("school")
        val graduation = intent.getStringExtra("graduation")
        val degree = intent.getStringExtra("degree")
        val major=intent.getStringExtra("major")

        val sentence = "$firstName $lastName graduated in $graduation with a $degree in $major from $school"

        biography.text = sentence
    }
}