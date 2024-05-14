package org.example.lesson1_10.lesson10

var countWin = 0

fun main() {
    while (true) {
        print("Хотите бросить кости? Введите \"да\" или \"нет\": ")
        val userInputNewGame = readln()
        if (userInputNewGame == "да") {
            org.example.lesson1_10.lesson10.newRoundGame()
        } else {
            println("Игра окончена. Человечество выйграло: ${org.example.lesson1_10.lesson10.countWin} раз")
            break
        }
    }
}

fun generateRandomNumber() = (1..6).random()

fun newRoundGame() {
    print("Ход игрока. Выпало: ")
    val playerStep = org.example.lesson1_10.lesson10.generateRandomNumber()
    println(playerStep)

    print("Ход компьютера. Выпало: ")
    val compStep = org.example.lesson1_10.lesson10.generateRandomNumber()
    println(compStep)

    if (playerStep > compStep) {
        println("Победило человечество")
        println()
        org.example.lesson1_10.lesson10.countWin++
    } else if (playerStep == compStep) {
        println("Ничья")
        println()
    } else {
        println("Победила машина")
        println()
    }


}
