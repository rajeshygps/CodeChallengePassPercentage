package com.raj.challenge

import android.os.Parcelable

/** Part 1:
 *Create a data model called Challenge that will hold 3 properties:
 * - question: The question that will be asked.
 * - answer:  The answer to the challenge question.
 * - correct: A boolean that indicates whether the provided answer is correct.*/
data class Challenge(val question: String, val answer: String, val correct: Boolean) {
}