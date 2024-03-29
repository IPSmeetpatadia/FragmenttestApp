package com.example.testapp.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import com.example.testapp.R

class RadioButtonActivity : AppCompatActivity() {

    private lateinit var radioGroup: RadioGroup
    lateinit var radioButton: RadioButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_radio_button)

        radioGroup = findViewById(R.id.reg_rg)

        findViewById<Button>(R.id.btnGetGender).setOnClickListener {
            val selectedID = radioGroup.checkedRadioButtonId
            radioButton = findViewById(selectedID)
            Toast.makeText(this, radioButton.text, Toast.LENGTH_SHORT).show()
        }
    }
}