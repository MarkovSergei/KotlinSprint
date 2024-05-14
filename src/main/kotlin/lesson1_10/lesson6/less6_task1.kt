package org.example.lesson1_10.lesson6

fun main() {
    println("Регистрация нового пользователя.")
    println()
    print("Введите новый логин: ")
    val userLogin = readln()
    print("Введите новый пароль: ")
    val userPassword = readln()

    while (true) {
        println("Авторизация")
        println()
        print("Введите логин: ")
        val userLoginInput = readln()
        print("Введите новый пароль: ")
        val userPasswordInput = readln()

        if (userLoginInput == userLogin && userPasswordInput == userPassword){
            println("Авторизация прошла успешно")
            break
        }
        else{
            println("Неверный Логин или пароль. Повторите попытку")
        }

    }

}