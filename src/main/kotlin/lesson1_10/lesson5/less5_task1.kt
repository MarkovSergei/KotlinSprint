package org.example.lesson1_10.lesson5

fun main() {

    val firstNumber = (0..50).random()
    val secondNumber = (0..50).random()
    val result = firstNumber + secondNumber
    println("Введите правильный ответ:")
    print("$firstNumber + $secondNumber = ")
    val answer = readln().toInt()

    if (answer == result) {
        println("Добро пожаловать!")
    } else {
        println("Доступ закрыт!")
    }
}