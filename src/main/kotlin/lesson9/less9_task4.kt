package org.example.lesson9

fun main() {
    print("Введите 5 ингредиентов, через запятую с пробелом: ")
    val userInputList = readln().split(", ").toList()
    println(userInputList)
}