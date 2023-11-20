package com.myapp.loginverification

class LoginVerification {
    fun verifyEmailAndPassword(email: String, password: String): Boolean {
        return email == "ala07@gmail.com" &&
                password == "test123"
    }
}