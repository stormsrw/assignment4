package com.example.assignment4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity()
{
    private lateinit var createButton: Button
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        createButton=findViewById(R.id.CreateButton)
        createButton.setOnClickListener{ view: View ->
            // grab input
            val firstNameInput = findViewById<EditText>(R.id.editTextFirstName)
            val lastNameInput = findViewById<EditText>(R.id.editTextLastName)
            val schoolInput = findViewById<EditText>(R.id.editTextTextSchool)
            val graduationInput = findViewById<EditText>(R.id.editTextTextGraduationYear)
            val degreeInput = findViewById<EditText>(R.id.editTextDegree)
            val majorInput = findViewById<EditText>(R.id.editTextMajor)
            //change the input to a string
            val firstname = firstNameInput.text.toString()
            val lastname = lastNameInput.text.toString()
            val school = schoolInput.text.toString()
            val graduation = graduationInput.text.toString()
            val degree = degreeInput.text.toString()
            val major = majorInput.text.toString()
            Intent(this,bioString::class.java).also {
                it.putExtra("firstName",firstname)
                it.putExtra("lastName",lastname)
                it.putExtra("school",school)
                it.putExtra("graduation",graduation)
                it.putExtra("degree",degree)
                it.putExtra("major",major)
                startActivity(it)
            }
        }
    }
}
