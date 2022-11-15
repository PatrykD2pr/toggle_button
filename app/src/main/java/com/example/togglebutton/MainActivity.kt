package com.example.togglebutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
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
            if (two.isChecked === false && three.isChecked === false && four.isChecked === false && five.isChecked === false && six.isChecked === false && seven.isChecked === false &&
                eight.isChecked === false && nine.isChecked === false) { }
            else {
                one.isChecked = false; two.isChecked = false; three.isChecked = false; four.isChecked = false; five.isChecked = false
                six.isChecked = false; seven.isChecked = false; eight.isChecked = false; nine.isChecked = false
            }
        }
        two.setOnCheckedChangeListener { _, isChecked ->
            if (one.isChecked === true && three.isChecked === false && four.isChecked === false && five.isChecked === false && six.isChecked === false && seven.isChecked === false &&
                eight.isChecked === false && nine.isChecked === false) { }
            else {
                one.isChecked = false; two.isChecked = false; three.isChecked = false; four.isChecked = false; five.isChecked = false
                six.isChecked = false; seven.isChecked = false; eight.isChecked = false; nine.isChecked = false
            }
        }
        three.setOnCheckedChangeListener { _, isChecked ->
            if (one.isChecked === true && two.isChecked === true && four.isChecked === false && five.isChecked === false && six.isChecked === false && seven.isChecked === false &&
                eight.isChecked === false && nine.isChecked === false) { }
            else {
                one.isChecked = false; two.isChecked = false; three.isChecked = false; four.isChecked = false; five.isChecked = false
                six.isChecked = false; seven.isChecked = false; eight.isChecked = false; nine.isChecked = false
            }
        }
        four.setOnCheckedChangeListener { _, isChecked ->
            if (one.isChecked === true && two.isChecked === true && three.isChecked === true && five.isChecked === false && six.isChecked === false && seven.isChecked === false &&
                eight.isChecked === false && nine.isChecked === false) { }
            else {
                one.isChecked = false; two.isChecked = false; three.isChecked = false; four.isChecked = false; five.isChecked = false
                six.isChecked = false; seven.isChecked = false; eight.isChecked = false; nine.isChecked = false
            }
        }
        five.setOnCheckedChangeListener { _, isChecked ->
            if (two.isChecked === true && three.isChecked === true && four.isChecked === true && one.isChecked === true && six.isChecked === false && seven.isChecked === false &&
                eight.isChecked === false && nine.isChecked === false) { }
            else {
                one.isChecked = false; two.isChecked = false; three.isChecked = false; four.isChecked = false; five.isChecked = false
                six.isChecked = false; seven.isChecked = false; eight.isChecked = false; nine.isChecked = false
            }
        }
        six.setOnCheckedChangeListener { _, isChecked ->
            if (two.isChecked === true && three.isChecked === true && four.isChecked === true && five.isChecked === true && one.isChecked === true && seven.isChecked === false &&
                eight.isChecked === false && nine.isChecked === false) { }
            else {
                one.isChecked = false; two.isChecked = false; three.isChecked = false; four.isChecked = false; five.isChecked = false
                six.isChecked = false; seven.isChecked = false; eight.isChecked = false; nine.isChecked = false
            }
        }
        seven.setOnCheckedChangeListener { _, isChecked ->
            if (two.isChecked === true && three.isChecked === true && four.isChecked === true && five.isChecked === true && six.isChecked === true && one.isChecked === true &&
                eight.isChecked === false && nine.isChecked === false) { }
            else {
                one.isChecked = false; two.isChecked = false; three.isChecked = false; four.isChecked = false; five.isChecked = false
                six.isChecked = false; seven.isChecked = false; eight.isChecked = false; nine.isChecked = false
            }
        }
        eight.setOnCheckedChangeListener { _, isChecked ->
            if (two.isChecked === true && three.isChecked === true && four.isChecked === true && five.isChecked === true && six.isChecked === true && seven.isChecked === true &&
                one.isChecked === true && nine.isChecked === false) { }
            else {
                one.isChecked = false; two.isChecked = false; three.isChecked = false; four.isChecked = false; five.isChecked = false
                six.isChecked = false; seven.isChecked = false; eight.isChecked = false; nine.isChecked = false
            }
        }
        nine.setOnCheckedChangeListener { _, isChecked ->
            if (two.isChecked === true && three.isChecked === true && four.isChecked === true && five.isChecked === true && six.isChecked === true && seven.isChecked === true &&
                eight.isChecked === true && one.isChecked === true) { wynik ++; score.text = wynik.toString() }
            else {
                one.isChecked = false; two.isChecked = false; three.isChecked = false; four.isChecked = false; five.isChecked = false
                six.isChecked = false; seven.isChecked = false; eight.isChecked = false; nine.isChecked = false
            }
        }
    }
}