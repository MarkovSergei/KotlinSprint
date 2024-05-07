package org.example.lesson9

fun main() {
    val listIng = listOf("мука", "молоко", "соль", "сахар")
    println("В рецепте есть следующие ингредиенты: $listIng")
    listIng.forEach {
        println(it)
    }
}