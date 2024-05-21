package org.example.lesson11.less11_task2

data class User2(
    val id: Int,
    val login: String,
    var password: String,
    val email: String,
    var bio: String? = null,
) {
    fun userInfo() {
        println("ID - $id, \nЛОГИН - $login,\nПАРОЛЬ - $password,\nПОЧТА - $email,\nБИОГРАФИЯ - $bio")
    }

    fun setBio(): String {
        print("Введите биографию: ")
        return readln()
    }

    fun changePassword(): String {
        print("Введите старый пароль: ")
        val oldPassword = readln()
        if (oldPassword == password) {
            print("Введите новый пароль: ")
            return readln()
        } else {
            println("Пароль неверный")
            return password
        }
    }
}

fun main() {

    val newUser = User2(
        1,
        "login",
        "password",
        "example@mail.ru",
    )

    if (newUser.setBio() == "") {
        newUser.bio = "Нет данных"
    } else {
        newUser.bio = newUser.setBio()
    }
    newUser.password = newUser.changePassword()
    println()
    newUser.userInfo()
}