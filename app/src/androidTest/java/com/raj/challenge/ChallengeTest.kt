package com.raj.challenge

import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import java.util.*


/**
 * Write tests that verify the correct operation of the passing function from Part 2.
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ChallengeTest {
    private lateinit var mChallengeList: MutableList<Challenge>
    private lateinit var challengeHandler: ChallengeHandler

    @Before
    fun createLogHistory() {
        challengeHandler = ChallengeHandler()
    }

    @Test
    fun passing_percentage_correct_true() {
        mChallengeList = mutableListOf()
        mChallengeList.add(Challenge("What is the smallest country in the world?", "Vatican City", true))
        mChallengeList
            .add(Challenge("What is the longest river in the world?", "Ganges", false))
        mChallengeList.add(Challenge("What is adb?", "android debug bridge", true))
        mChallengeList.add(Challenge("What is an activity?", "UI screen", true))
        mChallengeList
            .add(Challenge("Does fragment survive without an activity", "No", true))
        mChallengeList
            .add(Challenge("What is Intent", "An android message component", true))
        mChallengeList.add(Challenge("What is adb?", "android debug bridge", true))
        mChallengeList.add(Challenge("What is an activity?", "UI screen", true))
        mChallengeList.add(Challenge("What is an Service?", "Used for background operations", true))
        System.out.println("mChallengeList is ----" +Arrays.toString(mChallengeList.toTypedArray()))

        // 8 correct answers out of 9 total
        assertEquals(true, challengeHandler.isPassing(mChallengeList))
    }

    @Test
    fun passing_percentage_correct_false() {
        mChallengeList = mutableListOf()
        mChallengeList
            .add(Challenge("What is the smallest country in the world?", "Vatican City", true))
        mChallengeList
            .add(Challenge("What is the longest river in the world?", "Ganges", false))
        mChallengeList.add(Challenge("What is adb?", "android debug bridge", true))
        mChallengeList.add(Challenge("What is an activity?", "UI screen", true))
        mChallengeList
            .add(Challenge("What is the smallest country in the world?", "Vatican City", true))
        mChallengeList
            .add(Challenge("What is the longest river in the world?", "Ganges", false))
        mChallengeList.add(Challenge("What is adb?", "android debug bridge", true))
        mChallengeList.add(Challenge("What is an activity?", "UI screen", true))

        assertEquals(false, challengeHandler.isPassing(mChallengeList))
    }
}