package org.example.lesson8

fun main() {
    val arrayIng = arrayOf("картошка", "морковь", "лук", "мясо", "соль")
    print("какой ингридиент ты хочешь найти: ")
    val userInput = readln()
    var found = false

    for (i in arrayIng) {
        if (i == userInput) {
            found = true
        }
    }
    if (found == false) {
        println("Такого ингредиента в рецепте нет")
    }
    else{
        println("Ингредиент [$userInput] в рецепте есть")
    }
}