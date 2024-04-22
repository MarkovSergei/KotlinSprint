package org.example.lesson7

fun main() {
    while (true) {
        val smsCode = (1000..9999).random()
        println("Ваш код авторизации: $smsCode")

        print("Введите код из СМС: ")
        val smsCodeUserInput = readln().toInt()

        if (smsCodeUserInput == smsCode) {
            println("Вы авторизованы. Добро пожаловать!")
            break
        } else {
            println("Код введен неверно. Повторите попытку.")
        }
    }
}