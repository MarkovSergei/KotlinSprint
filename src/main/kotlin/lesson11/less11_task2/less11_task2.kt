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

    fun biography(): String {
        print("Введите биографию: ")
        return if (readln() == "") {
            ("Нет данных")
        } else{
            readln()
        }
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

    newUser.bio = newUser.biography()
    newUser.password = newUser.changePassword()
    println()
    newUser.userInfo()
}