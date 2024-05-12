package org.example.lesson10

fun main() {
    print("Введите логин: ")
    val login = readln()
    print("Введите пароль: ")
    val password = readln()

    if (isLengthRight(login) && isLengthRight(password)) {
        println("Приветственное сообщение, $login")
    } else {
        println("Логин или пароль недостаточно длинные")
    }
}

fun isLengthRight(str: String): Boolean {
    return str.length >= 4
}