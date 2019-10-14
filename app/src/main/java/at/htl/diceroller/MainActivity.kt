package at.htl.diceroller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton:Button = findViewById(R.id.roll_button)
        rollButton.text = "Let's roll!";
        rollButton.setOnClickListener{
            rollDice();
        }
    }

    private fun rollDice() {
        val resultText:TextView = findViewById(R.id.result_text)
        val random: Int = java.util.Random().nextInt(6) +1
        resultText.text = random.toString()
    }


}
