package com.example.baism_cw_2

class CredentialsValidator {
    fun isPasswordValid(password: String): Boolean {
        return password.length >= 6
    }
}