package com.example.togglebutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import android.widget.ToggleButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var one = findViewById<ToggleButton>(R.id.one)
        var two = findViewById<ToggleButton>(R.id.two)
        var three = findViewById<ToggleButton>(R.id.three)
        var four = findViewById<ToggleButton>(R.id.four)
        var five = findViewById<ToggleButton>(R.id.five)
        var six = findViewById<ToggleButton>(R.id.six)
        var seven = findViewById<ToggleButton>(R.id.seven)
        var eight = findViewById<ToggleButton>(R.id.eight)
        var nine = findViewById<ToggleButton>(R.id.nine)

        var kolejka: List<Int> = listOf(1,2,3,4,5,6,7,8,9)

        var wynik = 0
        var score = findViewById<TextView>(R.id.score)

        score.text = kolejka.toString()

        one.setOnCheckedChangeListener { _, isChecked ->
            if (kolejka[0] != 1) {
                Toast.makeText(this, "Niepoprawna kolejnosc!", Toast.LENGTH_SHORT).show()
                one.isChecked = false; two.isChecked = false; three.isChecked = false; four.isChecked = false; five.isChecked = false
                six.isChecked = false; seven.isChecked = false; eight.isChecked = false; nine.isChecked = false }
            else {
                if (kolejka[8] == 1) Toast.makeText(this, "Wygrales!", Toast.LENGTH_SHORT).show()
            }
        }
        two.setOnCheckedChangeListener { _, isChecked ->
            if (kolejka[1] != 2) {
                Toast.makeText(this, "Niepoprawna kolejnosc!", Toast.LENGTH_SHORT).show()
                one.isChecked = false; two.isChecked = false; three.isChecked = false; four.isChecked = false; five.isChecked = false
                six.isChecked = false; seven.isChecked = false; eight.isChecked = false; nine.isChecked = false }
            else {
                if (kolejka[8] == 2) Toast.makeText(this, "Wygrales!", Toast.LENGTH_SHORT).show()
            }
        }
        three.setOnCheckedChangeListener { _, isChecked ->
            if (kolejka[2] != 3) {
                Toast.makeText(this, "Niepoprawna kolejnosc!", Toast.LENGTH_SHORT).show()
                one.isChecked = false; two.isChecked = false; three.isChecked = false; four.isChecked = false; five.isChecked = false
                six.isChecked = false; seven.isChecked = false; eight.isChecked = false; nine.isChecked = false }
            else {
                if (kolejka[8] == 3) Toast.makeText(this, "Wygrales!", Toast.LENGTH_SHORT).show()
            }
        }
        four.setOnCheckedChangeListener { _, isChecked ->
            if (kolejka[3] != 4) {
                Toast.makeText(this, "Niepoprawna kolejnosc!", Toast.LENGTH_SHORT).show()
                one.isChecked = false; two.isChecked = false; three.isChecked = false; four.isChecked = false; five.isChecked = false
                six.isChecked = false; seven.isChecked = false; eight.isChecked = false; nine.isChecked = false }
            else {
                if (kolejka[8] == 4) Toast.makeText(this, "Wygrales!", Toast.LENGTH_SHORT).show()
            }
        }
        five.setOnCheckedChangeListener { _, isChecked ->
            if (kolejka[4] != 5) {
                Toast.makeText(this, "Niepoprawna kolejnosc!", Toast.LENGTH_SHORT).show()
                one.isChecked = false; two.isChecked = false; three.isChecked = false; four.isChecked = false; five.isChecked = false
                six.isChecked = false; seven.isChecked = false; eight.isChecked = false; nine.isChecked = false }
            else {
                if (kolejka[8] == 5) Toast.makeText(this, "Wygrales!", Toast.LENGTH_SHORT).show()
            }
        }
        six.setOnCheckedChangeListener { _, isChecked ->
            if (kolejka[5] != 6) {
                Toast.makeText(this, "Niepoprawna kolejnosc!", Toast.LENGTH_SHORT).show()
                one.isChecked = false; two.isChecked = false; three.isChecked = false; four.isChecked = false; five.isChecked = false
                six.isChecked = false; seven.isChecked = false; eight.isChecked = false; nine.isChecked = false }
            else {
                if (kolejka[8] == 6) Toast.makeText(this, "Wygrales!", Toast.LENGTH_SHORT).show()
            }
        }
        seven.setOnCheckedChangeListener { _, isChecked ->
            if (kolejka[6] != 7) {
                Toast.makeText(this, "Niepoprawna kolejnosc!", Toast.LENGTH_SHORT).show()
                one.isChecked = false; two.isChecked = false; three.isChecked = false; four.isChecked = false; five.isChecked = false
                six.isChecked = false; seven.isChecked = false; eight.isChecked = false; nine.isChecked = false }
            else {
                if (kolejka[8] == 7) Toast.makeText(this, "Wygrales!", Toast.LENGTH_SHORT).show()
            }
        }
        eight.setOnCheckedChangeListener { _, isChecked ->
            if (kolejka[7] != 8) {
                Toast.makeText(this, "Niepoprawna kolejnosc!", Toast.LENGTH_SHORT).show()
                one.isChecked = false; two.isChecked = false; three.isChecked = false; four.isChecked = false; five.isChecked = false
                six.isChecked = false; seven.isChecked = false; eight.isChecked = false; nine.isChecked = false }
            else {
                if (kolejka[8] == 8) Toast.makeText(this, "Wygrales!", Toast.LENGTH_SHORT).show()
            }
        }
        nine.setOnCheckedChangeListener { _, isChecked ->
            if (kolejka[8] != 9) {
                Toast.makeText(this, "Niepoprawna kolejnosc!", Toast.LENGTH_SHORT).show()
                one.isChecked = false; two.isChecked = false; three.isChecked = false; four.isChecked = false; five.isChecked = false
                six.isChecked = false; seven.isChecked = false; eight.isChecked = false; nine.isChecked = false }
            else {
                if (kolejka[8] == 9) Toast.makeText(this, "Wygrales!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}