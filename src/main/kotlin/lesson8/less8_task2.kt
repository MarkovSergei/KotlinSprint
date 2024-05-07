package org.example.lesson8

fun main() {
    val arrayIng = arrayOf("картошка", "морковь", "лук", "мясо", "соль")
    print("какой ингридиент ты хочешь найти: ")
    val userInput = readln()

    for (i in arrayIng) {
        if (i == userInput) {
            println("Ингредиент [$userInput] в рецепте есть")
            return
        }
    }
    println("Такого ингредиента в рецепте нет")
}