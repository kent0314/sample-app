package com.alekusa.sample_app

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    var textView: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        this.buttonClickListener()
        this.buttonClick()
        this.bloodButtonClickListener()
        this.listButtonClicklistenner()
    }

    private fun buttonClickListener() {
        val button = findViewById<Button>(R.id.ButtonID)
        this.textView = findViewById(R.id.TextViewID)
        button.setOnClickListener {
            Toast.makeText(this, "大塚ケント", Toast.LENGTH_SHORT).show()

            if (this.textView?.text == "大塚ケント") {
                this.textView?.text = "けんと"
            } else {
                this.textView?.text = "大塚ケント"
            }
        }
    }

    private fun bloodButtonClickListener() {
        val bloodJampButton = findViewById<Button>(R.id.BloodJampButtonID)
        bloodJampButton.setOnClickListener {
            val intent = Intent(this, BloodActivity::class.java)
            this.startActivity(intent)
        }
    }

    private fun buttonClick() {
        val button = findViewById<Button>(R.id.PushID)
        button.setOnClickListener {
            Toast.makeText(this, "トースト", Toast.LENGTH_SHORT).show()

            if (button.text == "休みたい") {
                button.text = "帰りたい"
            } else {
                button.text = "休みたい"
            }
        }
    }

    private fun listButtonClicklistenner() {
        val button = findViewById<Button>(R.id.LIstJampButtonID)
        button.setOnClickListener {
            val intent = Intent(this, ListActivity::class.java)
            this.startActivity(intent)
        }
    }
}
