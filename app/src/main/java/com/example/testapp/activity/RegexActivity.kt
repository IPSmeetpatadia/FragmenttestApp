package com.example.testapp.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.testapp.R
import java.util.regex.Pattern

class RegexActivity : AppCompatActivity() {

    private val PATTERN = Pattern.compile(
        "[A-Za-z]+[A-Za-z]+\\+?\\d+\\(?\\d+\\):[\\s\\S][A-Za-z]+[A-Za-z\\d]"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_regex)

        val editText = findViewById<EditText>(R.id.editTextTextPersonName)

        findViewById<Button>(R.id.button).setOnClickListener {
            if (isValidString(editText.text.toString())) {
                Toast.makeText(this, "valid", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "invalid", Toast.LENGTH_SHORT).show()
            }
        }
    }

    fun isValidString(str: String): Boolean{
        return PATTERN.matcher(str).matches()
    }

}