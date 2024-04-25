package org.example.lesson8

fun main() {
    print("Сколько ингредиентов будет в блюде: ")
    val ingNumber = readln().toInt() - 1

    var ingUserArray: Array<String> = arrayOf()
    for (i in 0..ingNumber) {
        print("Введите ингредиент: ")
        val userInput = readln()
        ingUserArray += userInput
    }
    println(ingUserArray.contentToString())
}