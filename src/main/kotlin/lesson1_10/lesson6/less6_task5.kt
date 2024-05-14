package org.example.lesson1_10.lesson6

fun main() {
    println("Регистрация нового пользователя.")
    println()
    print("Введите новый логин: ")
    val userLogin = readln()
    print("Введите новый пароль: ")
    val userPassword = readln()


    for (i in 3 downTo 1) {
        val botTest1 = (1..9).random()
        val botTest2 = (1..9).random()
        println("Решите пример: ")
        print("$botTest1 + $botTest2 = ")

        val botTestResult = botTest1 + botTest2
        val userBotTestResult = readln().toInt()

        if (userBotTestResult == botTestResult) {
            println("Добро пожаловать!")
            while (true) {
                println("Авторизация")
                println()
                print("Введите логин: ")
                val userLoginInput = readln()
                print("Введите новый пароль: ")
                val userPasswordInput = readln()

                if (userLoginInput == userLogin && userPasswordInput == userPassword) {
                    println("Авторизация прошла успешно")
                    break
                } else {
                    println("Неверный Логин или пароль. Повторите попытку")
                }
            }
            break
        } else if (userBotTestResult != botTestResult && i > 1) {
            println("Неудача. Осталось попыток: ${i - 1} ")
        } else {
            println("Доступ запрещен")
            break
        }
    }
}