package com.draakoon.actividadbotones

import android.graphics.Color
import android.os.Bundle
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonBlue: Button = findViewById(R.id.button_1)
        val buttonRed: Button = findViewById(R.id.button_2)
        val buttonOrange: Button = findViewById(R.id.button_3)
        val buttonBlack: Button = findViewById(R.id.button_4)
        val buttonGreen: Button = findViewById(R.id.button_5)

        buttonBlue.setOnClickListener {
            this.changesAttributes(R.color.blue)
        }

        buttonRed.setOnClickListener {
            this.changesAttributes(R.color.red)
        }

        buttonOrange.setOnClickListener {
            this.changesAttributes(R.color.orange)
        }

        buttonBlack.setOnClickListener {
            this.changesAttributes(R.color.black)
        }

        buttonGreen.setOnClickListener {
            this.changesAttributes(R.color.green)
        }

    }

    private fun changesAttributes(colorChange: Int) {

        val textEditable: TextView = findViewById(R.id.text_editable)
        val inputText: EditText = findViewById(R.id.input_text)
        val textChange = inputText.text.toString() // Get value text writer

        /* Choose change background or text color, comment or uncomment your option */
        if (textChange != "") {

            // Change background color - Text color default white
                textEditable.setBackgroundColor(ContextCompat.getColor(this, colorChange)) // This change background of TextView
                textEditable.setTextColor(ContextCompat.getColor(this, R.color.white)); // Text color default white

            // Change text color - background color default white
                /*textEditable.setTextColor(ContextCompat.getColor(this, colorChange)); // This change color text of TextView
                textEditable.setBackgroundColor(ContextCompat.getColor(this, R.color.white)); // Background default white*/

            // Change attributes for EditText and TextView
            textEditable.text = textChange;
            inputText.setHint(R.string.probar_color)

        } else {
            textEditable.setText(R.string.escribir_algo)
            textEditable.setBackgroundColor(ContextCompat.getColor(this, R.color.gray));
            textEditable.setTextColor(ContextCompat.getColor(this, R.color.white));
            inputText.setHint(R.string.intentar)
        }

        // Set value initial EditText
        inputText.setText("")

    }

}