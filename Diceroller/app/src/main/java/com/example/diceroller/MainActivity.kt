package com.example.diceroller

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import java.util.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton = findViewById<Button>(R.id.roll_button)
        rollButton.setOnClickListener{
            rollDice2()
            Toast.makeText(
             this, "Do xuc sac thanh cong",Toast.LENGTH_SHORT).show()
            rollDice()
            rollDice1()
            roll_sum()

        }
    }

    private fun rollDice2() {
        var RandomInt= Random().nextInt(6)+1
        val resultText2=findViewById<TextView>(R.id.result_text2)
        resultText2.setText(RandomInt.toString())
        val dice_image2=findViewById<ImageView>(R.id.dice_image2)
        val drawablerecouse=when(RandomInt){
            1->R.drawable.dice_1
            2->R.drawable.dice_2
            3->R.drawable.dice_3
            4->R.drawable.dice_4
            5->R.drawable.dice_5
            else ->R.drawable.dice_6
        }
        dice_image2.setImageResource(drawablerecouse)
    }

    private fun roll_sum() {
        val result_sum=findViewById<TextView>(R.id.result_sum)
        val resultText1=findViewById<TextView>(R.id.result_text1)
        val resultText=findViewById<TextView>(R.id.result_text)
        val resultText2=findViewById<TextView>(R.id.result_text2)
        result_sum.setText((resultText.getText().toString().toInt()+resultText1.getText().toString().toInt()+resultText2.getText().toString().toInt()).toString())
    }

    private fun rollDice1() {

        var RandomInt= Random().nextInt(6)+1
        val resultText1=findViewById<TextView>(R.id.result_text1)
        resultText1.setText(RandomInt.toString())
        val dice_image1=findViewById<ImageView>(R.id.dice_image1)
        val drawablerecouse=when(RandomInt){
            1->R.drawable.dice_1
            2->R.drawable.dice_2
            3->R.drawable.dice_3
            4->R.drawable.dice_4
            5->R.drawable.dice_5
            else ->R.drawable.dice_6
        }
        dice_image1.setImageResource(drawablerecouse)
    }

    private fun rollDice() {
        val resultText=findViewById<TextView>(R.id.result_text)
        var RandomInt= Random().nextInt(6)+1
        resultText.setText(RandomInt.toString())
        val dice_image=findViewById<ImageView>(R.id.dice_image)
        val drawablerecouse=when(RandomInt){
            1->R.drawable.dice_1
            2->R.drawable.dice_2
            3->R.drawable.dice_3
            4->R.drawable.dice_4
            5->R.drawable.dice_5
            else ->R.drawable.dice_6
        }
        dice_image.setImageResource(drawablerecouse)
        //resultText.text=RandomInt.toString()
    }
}