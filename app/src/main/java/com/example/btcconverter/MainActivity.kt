package com.example.btcconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.btcconverter.databinding.ActivityMainBinding
import java.text.NumberFormat

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.convertBtn.setOnClickListener {
            calculateBTC()
        }

    }

    private fun calculateBTC() {
        val btcValue: Double = 0.00000004
        val convertAmount = binding.amountTextBox.text.toString().toDouble()
//        val decimalPlace = String.format("%.2f", result)
//        binding.conertedAmount.text = decimalPlace
        var result = convertAmount * btcValue
        var roundUp = binding.switchUp.isChecked
        if (roundUp){
           result = kotlin.math.round(result)
        }
        var formattedResult = NumberFormat.getCurrencyInstance().format(result)
        binding.conertedAmount.text = formattedResult


    }
}
//        val mEditAmountInNaira = findViewById<EditText>(R.id.amount_text_box)
//        val mConvertBTN = findViewById<Button>(R.id.convert_btn)
//        val mConvertedAmount = findViewById<TextView>(R.id.conertedAmount)
//
//        mConvertBTN.setOnClickListener {
//
//            val valueToConvert: Double = mEditAmountInNaira.getText().toString().toDouble()
//            val result: Double = valueToConvert * btcValue
//            val decimalPlace = String.format("%.2f", result)
//            mConvertedAmount.text = decimalPlace
//        }
//    }
//}