package org.example.lesson1_10.lesson9

fun main() {
    val listIng = listOf("мука", "молоко", "соль", "сахар")
    println("В рецепте есть следующие ингредиенты: $listIng")
    listIng.forEach {
        println(it)
    }
}