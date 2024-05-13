package org.example.lesson10

const val LOGIN = "логин"
const val PASSWORD = "пароль"
const val TOKEN_LENGTH = 32

val symbolList = listOf(('0'..'9') + ('a'..'z') + ('A'..'Z'))
val orderList = listOf("Товар1", "Товар2", "Товар3")


fun main() {
    val token = authorizesVerifiesGeneratesToken()
    getOrderList(token)
}

fun authorizesVerifiesGeneratesToken(): String? {
    print("Введите логин: ")
    val login = readln()

    print("Введите логин: ")
    val password = readln()

    return if (login == LOGIN && password == PASSWORD) {
        symbolList.random().shuffled().take(TOKEN_LENGTH).joinToString("")
    } else {
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