package org.example.lesson9

fun main() {
    val listIng = mutableListOf("мука", "молоко", "соль")
    println("В рецепте есть базовые ингредиенты: $listIng")

    print("Желаете добавить еще?(да/нет): ")
    val userSolution = readln()

    if (userSolution == "да") {
        print("Какой ингредиент вы хотите добавить?: ")
        listIng.add(readln())
        println("Теперь в рецепте есть следующие ингредиенты: $listIng")
    }
}