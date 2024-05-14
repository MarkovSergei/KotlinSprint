package org.example.lesson1_10.lesson9

import java.util.*

const val ING_NUMBER = 5

fun main() {
    println("Введите $ING_NUMBER ингредиентов через Enter: ")
    val userList = List(ING_NUMBER) { readln() }.sorted().toSet()
    val str = userList.joinToString(", ")
    print(str.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() })
}
