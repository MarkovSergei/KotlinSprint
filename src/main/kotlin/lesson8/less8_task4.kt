package org.example.lesson8

fun main() {
    val arrayIng = arrayOf("картошка", "лук", "сало", "соль", "капуста")
    for (i in arrayIng) {
        println(i)
    }
    println()
    print("какой ингредиент хотите заменить: ")
    val userInputIndexArray = readln()
    val userIndex = arrayIng.indexOf(userInputIndexArray)

    if (userIndex == -1) {
        println("Такого ингредиента нет в списке!")
    } else {
        print("Какой ингредиент хотите добавить вместо: ")
        val userInput2 = readln()
        println()
        arrayIng[userIndex] = userInput2
        println("Готово! Вы сохранили следующий список: ")
        for (i in arrayIng) {
            println(i)
        }
    }

}