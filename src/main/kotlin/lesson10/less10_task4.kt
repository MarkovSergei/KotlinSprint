package org.example.lesson10

var countWin = 0

fun main() {
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

    restartGame()
}

fun generateRandomNumber() = (1..6).random()

fun restartGame() {
    print("Хотите бросить кости еще раз? Введите Да или Нет: ")
    val userInputNewGame = readln()
    println()
    if (userInputNewGame == "Да") {
        main()
    } else {
        println("Игра окончена. Человечество выйграло: $countWin раз")
    }

}
