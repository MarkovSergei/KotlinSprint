package org.example.lesson10

fun main() {
    print("Ход игрока. Выпало: ")
    val playerStep = generateRandomNumber()
    println(playerStep)
    print("Ход компьютера. Выпало: ")
    val compStep = generateRandomNumber()
    println(compStep)
    if (playerStep > compStep) {
        println("Победило человечество")
    } else if (playerStep == compStep) {
        println("Ничья")
    } else {
        println("Победила машина")
    }
}

fun generateRandomNumber() = (1..6).random()
