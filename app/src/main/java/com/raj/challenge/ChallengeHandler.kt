package com.raj.challenge

import android.util.Log

class ChallengeHandler {
    /** Part 2:
     * Write a function named isPassing that accepts a collection of Challenge objects as the input:
     * - Return true/false if the collection is passing (number of correct responses is > 87.5%).
     * - Return nil if there are no challenges in the collection input.
     * - Note: A Challenge is considered correct when the correct property is set to true. */
    fun isPassing(challengeList: MutableList<Challenge>): Boolean {
        Log.d("ChallengeHandler", "In isPassing method")

        if (challengeList.isNullOrEmpty())
            return false
        val totalResponses: Int = challengeList.size
        val correctResponsesPercentage: Float
        var correctResponses = 0
        for (challenge in challengeList) {
            if (challenge.correct) {
                correctResponses += 1
            }
        }
        // percentage = correctResponse/totalResponse * 100
        correctResponsesPercentage = (correctResponses.toFloat() / totalResponses) * 100
        Log.d("ChallengeHandler", "correctResponses value $correctResponses , totalResponses are $totalResponses, correctResponsesPercentage is $correctResponsesPercentage")

        return correctResponsesPercentage > 87.5
    }
}