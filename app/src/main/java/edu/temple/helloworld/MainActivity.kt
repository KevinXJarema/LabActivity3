package edu.temple.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    // Declare view properties - the first one is done for you
    lateinit var displayTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.clickMeButton).setOnClickListener {
            errorCheck()
        }


    }
    fun errorCheck(){
        displayTextView = findViewById(R.id.displayTextView)
        var name = findViewById<EditText>(R.id.nameEditText).text
        if(name.equals("")){

        displayTextView.text = "Error, no name was input."
            return
        }
        displayTextView.text = "Hello, ${name}"


    }




}