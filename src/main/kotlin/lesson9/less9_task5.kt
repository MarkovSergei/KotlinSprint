package org.example.lesson9

const val ING_NUMBER = 5

fun main() {
    println("Введите $ING_NUMBER ингредиентов через Enter: ")
    val userList = List(ING_NUMBER) { readln() }.sorted().toSet()
    val str = userList.joinToString(", ")
    print(str.capitalize())
}
