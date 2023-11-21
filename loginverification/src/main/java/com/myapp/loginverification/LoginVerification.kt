package com.myapp.loginverification

class LoginVerification {
    fun verifyCredentials(email: String, password: String): Boolean {
        return (email == "ala07@gmail.com" &&
                password == "test123") ||
                (email == "test@user.com" && password == "user1234")
    }
}