package com.example.testapp.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.testapp.R

class MainActivity : AppCompatActivity() {

    lateinit var value: String
    var value1: Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var enteredData = findViewById<EditText>(R.id.edtxt_enterName)
        var enteredNumber1 = findViewById<EditText>(R.id.edtxt_number1)
        var enteredNumber2 = findViewById<EditText>(R.id.edtxt_number2)
        var displayData = findViewById<TextView>(R.id.txt_displayName)

        findViewById<Button>(R.id.btn_enter).setOnClickListener {
            value = enteredData.text.toString()
            displayData.text =  value


           value1 = enteredNumber1.text.toString().toInt()
            var value2:Int = enteredNumber2.text.toString().toInt()
            var sum:Int = value1!!.toInt() + value2

            Toast.makeText(this@MainActivity, sum.toString(), Toast.LENGTH_SHORT).show();
        }
    }
}