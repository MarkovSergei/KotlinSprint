package org.example.lesson10

const val LOGIN = "логин"
const val PASSWORD = "пароль"
const val TOKEN_LENGTH = 32
val orderList = listOf("Товар1", "Товар2", "Товар3")

fun main() {
    val token = authorizesVerifiesGeneratesToken()
    if (token != null) {
        getOrderList(token)
    } else {
        println("Авторизация неудачная")
    }
}

fun authorizesVerifiesGeneratesToken(): String? {
    print("Введите логин: ")
    val login = readln()
    print("Введите логин: ")
    val password = readln()
    return if (login == LOGIN && password == PASSWORD) {
        (1..TOKEN_LENGTH).map { ('A'..'z') + ('A'..'Z') + ('0'..'9').random() }.joinToString("")
    } else {
        null
    }

}

fun getOrderList(token: String) = println(orderList)
