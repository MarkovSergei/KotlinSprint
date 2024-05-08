package org.example.lesson9

const val ingNumber = 5

fun main() {
    println("Введите $ingNumber ингредиентов через Enter: ")
    val userList = List(ingNumber) { readln() }.sorted().toSet()
    val str = userList.joinToString(", ")
    print(str.capitalize())
}
