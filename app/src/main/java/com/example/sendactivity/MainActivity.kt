package com.example.sendactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val name = findViewById<EditText>(R.id.name)
        val age = findViewById<EditText>(R.id.age)
        val gander = findViewById<EditText>(R.id.gender)
        val saveBtn = findViewById<Button>(R.id.saveBtn)

        //button click
        saveBtn.setOnClickListener {
            var name = name.text.toString()
            var age = age.text.toString()
            var gander = gander.text.toString()
    //intent to start activity
            var intent = Intent(this, Activity2::class.java)
            intent.putExtra("Name", name)
            intent.putExtra("Age", age)
            intent.putExtra("Gander", gander)
            startActivity(intent)
        }
    }

}
