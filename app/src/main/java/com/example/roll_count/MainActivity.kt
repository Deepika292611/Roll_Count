package com.example.roll_count

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }
        val rollButton1: Button = findViewById(R.id.roll_button1)
        rollButton1.setOnClickListener { rollDice1() }
    }
    private fun rollDice() {
        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text="Dice Rolled!"
    }
    companion object {
        var count: Int = 1
    }
    private fun rollDice1(){
        val resultText: TextView = findViewById(R.id.result_text)

        if(count==1){
            count++
        }
        else{
            if(count>1 && count<6){
                resultText.text=count.toString()
                count++

            }
            else{
                resultText.text=count.toString()
            }
        }
    }

}


