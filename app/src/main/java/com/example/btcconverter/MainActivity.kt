package com.example.btcconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btcValue : Double = 0.00000004
        val mEditAmountInNaira = findViewById<EditText>(R.id.amount_text_box)
        val mConvertBTN = findViewById<Button>(R.id.convert_btn)
        val mConvertedAmount = findViewById<TextView>(R.id.conertedAmount)

        mConvertBTN.setOnClickListener {

            val valueToConvert: Double = mEditAmountInNaira.getText().toString().toDouble()
            val result : Double = valueToConvert * btcValue
            mConvertedAmount.text = result.toString()



        }
    }
}