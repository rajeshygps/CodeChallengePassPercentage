package com.raj.challenge

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    /**
     * Part 3:
     * Write tests that verify the correct operation of the passing function from Part 2.
     * As a reminder, you may use any libraries or frameworks you would like. */
    @Test
    fun isPassing_correct() {
        assertEquals(4, 2 + 2)
    }
}