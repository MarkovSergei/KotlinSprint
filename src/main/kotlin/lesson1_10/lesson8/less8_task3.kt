package org.example.lesson1_10.lesson8

fun main() {
    val arrayIng = arrayOf("картошка", "морковь", "лук", "мясо", "соль")
    print("какой ингридиент ты хочешь найти: ")
    val userInput = readln()

    if (arrayIng.indexOf(userInput) == -1) {
        println("Такого ингредиента в рецепте нет")
    } else {
        println("Ингредиент [$userInput] в рецепте есть")
    }
}