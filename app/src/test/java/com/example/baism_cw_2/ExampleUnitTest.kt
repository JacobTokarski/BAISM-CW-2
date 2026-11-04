package com.example.baism_cw_2

import org.junit.Test

import org.junit.Assert.*
import kotlin.test.assertFalse
import kotlin.test.assertTrue

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    private val validator = CredentialsValidator()

    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun password_isCorrectLength_True() {
        val result = validator.isPasswordValid("BezpieczneHaslo123")
        assertTrue(result)
    }

    @Test
    fun password_isTooShort_False() {
        val result = validator.isPasswordValid("123")
        assertFalse(result)
    }
}