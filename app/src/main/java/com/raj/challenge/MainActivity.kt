package com.raj.challenge

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val passPercentageTextView = findViewById<TextView>(R.id.passParcentage)

        val mChallengeList:MutableList<Challenge> = mutableListOf()
        mChallengeList
            .add(Challenge("What is the smallest country in the world?", "Vatican City", true))
        passPercentageTextView.setText("IsPassed : " + ChallengeHandler().isPassing(mChallengeList))
    }
}