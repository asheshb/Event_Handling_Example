package com.example.eventhandlingexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myName: TextView = findViewById(R.id.name)
        val showName: Button = findViewById(R.id.show_name)

//region
        val listener = object: View.OnClickListener {
            override fun onClick(v: View?) {
                //myName.setText(R.string.my_name)
                myName.text = getString(R.string.my_name)
            }
        }

        showName.setOnClickListener(listener)
//endregion

//region
        val myMessage: EditText = findViewById(R.id.message)
        val showMessage: Button = findViewById(R.id.show_message)

        showMessage.setOnClickListener {
            Toast.makeText(this, myMessage.text, Toast.LENGTH_LONG).show()
        }
//endregion
    }


}
