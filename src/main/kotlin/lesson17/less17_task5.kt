package org.example.lesson17

fun main() {
    val newUser = Person("Семён", "7894561230")
    newUser.newLogin = "Семён Семёныч"
    newUser.password = "4564646"
    println(newUser.password)
}

class Person(
    login: String,
    password: String,
) {
    var newLogin = login
        set(value) {
            if (value != newLogin) {
                field = value
                println("Вы измененили Логин на '$newLogin'")
            }
        }
    var password: String = password
        get() {
            return "*".repeat(field.length)
        }
        set(value) {
            if (value != password) {
                field = password
                println("Поменять пароль нельзя")
            }
        }
}
