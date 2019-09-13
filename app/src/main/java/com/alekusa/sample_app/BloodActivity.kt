package com.alekusa.sample_app

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class BloodActivity : AppCompatActivity() {
    private var result: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_blood)
        this.result = findViewById(R.id.ResultID)
        this.didChangeInputTextListener()
    }

    private fun didChangeInputTextListener() {
        val inputText = findViewById<EditText>(R.id.BloodInputTextID)
        inputText.addTextChangedListener(object: TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                result?.text = "あなたの血液型は" + s.toString() + "です。"
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            }

        })
    }
}
