package org.example.lesson10

fun main() {
    print("Введите логин: ")
    val userName = readln()
    print("Введите пароль: ")
    val password = readln()

    checkLength(userName, password)
}

const val LENGTH_SYMBOLS = 4

fun checkLength(userName: String, password: String) {
    val check1 = userName.length
    val check2 = password.length
    if (check1 and check2 >= LENGTH_SYMBOLS) {
        println("Добро пожаловать, $userName")
    } else {
        println("Логин или пароль недостаточно длинные")
    }
}