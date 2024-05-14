package org.example.lesson10

const val LOGIN = "логин"
const val PASSWORD = "пароль"
const val TOKEN_LENGTH = 32

val orderList = listOf("Товар1", "Товар2", "Товар3")

fun main() {
    print("Введите логин: ")
    val login = readln()

    print("Введите логин: ")
    val password = readln()

    val token = authorizesVerifies(login, password)
    getOrderList(token)
}

fun authorizesVerifies(login: String, password: String): String? {
    return if (login == LOGIN && password == PASSWORD) {
        generateToken().toString()
    }
    else {
        null
    }
}

fun getOrderList(token: String?) {
    if (token != null) {
        println(orderList)
    } else {
        println("Авторизация неудачная")
    }
}

fun generateToken() {
    val symbolList = listOf(('0'..'9') + ('a'..'z') + ('A'..'Z'))
    symbolList.random().shuffled().take(TOKEN_LENGTH).joinToString("")
}