package org.example.lesson10

var countWin = 0

fun main() {
    while (true) {
        print("Хотите бросить кости? Введите \"да\" или \"нет\": ")
        val userInputNewGame = readln()
        if (userInputNewGame == "да") {
            newRoundGame()
        } else {
            println("Игра окончена. Человечество выйграло: $countWin раз")
            break
        }
    }
}

fun generateRandomNumber() = (1..6).random()

fun newRoundGame() {
    print("Ход игрока. Выпало: ")
    val playerStep = generateRandomNumber()
    println(playerStep)

    print("Ход компьютера. Выпало: ")
    val compStep = generateRandomNumber()
    println(compStep)

    if (playerStep > compStep) {
        println("Победило человечество")
        println()
        countWin++
    } else if (playerStep == compStep) {
        println("Ничья")
        println()
    } else {
        println("Победила машина")
        println()
    }


}
