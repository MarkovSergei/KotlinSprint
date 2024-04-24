package org.example.lesson8

fun main() {
    val arrayIng = arrayOf("картошка", "лук", "сало", "соль", "капуста")
    for (i in arrayIng) {
        println(i)
    }
    println()
    print("какой ингредиент хотите заменить: ")
    val userInputIndexArray = readln()
    if (arrayIng.indexOf(userInputIndexArray) == -1) {
        println("Такого ингредиента нет в списке!")
    } else {
        val userIndex = arrayIng.indexOf(userInputIndexArray)
        print("Какой ингредиент хотите добавить вместо: ")
        val userInput2 = readln()
        println()
        arrayIng[userIndex] = userInput2
        arrayIng[userIndex]
        println("Готово! Вы сохранили следующий список: ")
        for (i in arrayIng) {
            println(i)
        }
    }

}