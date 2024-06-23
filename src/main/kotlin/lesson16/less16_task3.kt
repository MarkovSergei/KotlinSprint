package org.example.lesson16

fun main() {
    val user = User()
    user.inputPassword("password")
}

class User {
    private val correctPassword = "password"
    private val correctLogin = "login"

    fun inputPassword(password: String) {
        val isValid = password == correctPassword
        return println("Пароль $password релевантен: $isValid")
    }
    }

