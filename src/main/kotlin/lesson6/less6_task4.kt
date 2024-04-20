package org.example.lesson6

fun main() {
    println("Угадай число от 1 до 9 (у тебя 5 попыток): ")
    val randomNumber = (1..9).random()
    for (i in 5 downTo 1) {
        val userNumber = readln().toInt()
        if (userNumber == randomNumber) {
            println("Ты угадал! Это была великолепная игра!")
            break
        } else if (userNumber != randomNumber && i > 1) {
            println("Неверно. Осталось ${i - 1} попыток")
        } else {
            println("Ты проиграл. Было загадано число $randomNumber")
        }
    }
}