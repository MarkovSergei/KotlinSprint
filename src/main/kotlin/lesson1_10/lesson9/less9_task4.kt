package org.example.lesson1_10.lesson9

fun main() {
    print("Введите 5 ингредиентов, через запятую с пробелом: ")
    val userInputList = readln().split(", ").toList().sorted()
    println(userInputList)
}