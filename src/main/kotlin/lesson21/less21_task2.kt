package org.example.lesson21

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    println("Сумма четных чисел в списке $numbers равна ${numbers.evenNumbersSum()}")
}

fun List<Int>.evenNumbersSum(): Int {
    val evens = this.filter { it % 2 == 0 }
    return evens.sum()
}