package com.myapp.loginverification

import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    val verification = LoginVerification()

    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun loginSuccessful_whenCorrectCredentials() {
        assertTrue(verification.verifyEmailAndPassword("ala07@gmail.com", "test123"))
    }

    @Test
    fun loginSuccessful_whenWrongEmail() {
        assertFalse(verification.verifyEmailAndPassword("ala@gmail.com", "test123"))
    }

    @Test
    fun loginSuccessful_whenWrongPassword() {
        assertFalse(verification.verifyEmailAndPassword("ala07@gmail.com", "test12345"))
    }
}