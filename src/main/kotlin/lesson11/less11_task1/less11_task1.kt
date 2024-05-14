package org.example.lesson11.less11_task1

data class User(
    val id: String,
    val login: String,
    val password: String,
    val email: String
) {

}


fun main() {
    val user1 = User(
        id = "1",
        login = "user1",
        password = "password1",
        email = "user1@mail.ru",
    )

    val user2 = User(
        id = "2",
        login = "user2",
        password = "password2",
        email = "user2@mail.ru",
    )

    println("${user1.id}, ${user1.login}, ${user1.password}, ${user1.email}")
    println("${user2.id}, ${user2.login}, ${user2.password}, ${user2.email}")
}