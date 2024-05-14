package org.example.lesson1_10.lesson6

fun main() {
    print("Угадай число от 1 до 9 (у тебя 5 попыток): ")
    val randomNumber = (1..9).random()
    for (i in 5 downTo 1) {
        val userNumber = readln().toInt()
        if (userNumber == randomNumber) {
            println("Ты угадал! Это была великолепная игра!")
            return
        } else if (i > 1) {
            println("Неверно. Осталось попыток: ${i - 1}")
        }
    }
    println("Ты проиграл. Было загадано число $randomNumber")
}