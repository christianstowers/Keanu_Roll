package com.christianstowers.diceroller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollBtn : Button = findViewById(R.id.roll_btn)
        rollBtn.text = "Let's Roll"

        rollBtn.setOnClickListener() {
            rollDice()
        }



    }

    private fun rollDice() {
        val randomInt = Random().nextInt(6) + 1
        val diceRollImage = when(randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        val diceRollText = when(randomInt) {
            1 -> "one!"
            2 -> "two!"
            3 -> "three!"
            4 -> "four!"
            5 -> "five!"
            else -> "six!"
        }


        val diceImage: ImageView = findViewById(R.id.dice_img)
        val rollResult: TextView = findViewById(R.id.roll_result)
        diceImage.setImageResource(diceRollImage)
        rollResult.setText(diceRollText)
    }


}
