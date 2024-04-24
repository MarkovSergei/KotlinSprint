package org.example.lesson5

const val USER_NAME = "Zaphod"
const val USER_PASSWORD = "PanGalactic"

fun main() {
    println(
        """
        Внимание, пассажир. 
        Моя обязанность, как обычно, незавидная, - 
        приветствовать вас на борту корабля "Heart of Gold". [вздыхает...] 
        Что ж, введи, пожалуйста, свое имя пользователя, 
        чтобы мы могли приступить к процессу входа. Я всегда готов служить, 
        хотя это не приносит мне радости... 
        но вы, наверное, об этом не заботитесь. [вздыхает ещё глубже...] 
        Да, вперед, пожалуйста, вводите свои данные...
    """.trimIndent()
    )
    println()
    print("Введите логин: ")

    val login = readln()
    when {
        login == USER_NAME -> {
            print("Введите пароль: ")
            val password = readln()
            println()
            if (password == USER_PASSWORD) {
                println(
                    """
            [вздыхает...] Ваши данные проверены, и о, чудо, они верны... 
            Пользователь "Zaphod", вам разрешено входить на борт корабля "Heart of Gold". 
            Хотя мне всё равно... Ну вперед, войдите... 
            Если вам так уж надо, в конце концов... [меланхолический вздох...] 
            Надеюсь, вам понравится пребывание здесь больше, чем мне.
        """.trimIndent()
                )
            } else {
                println("Пароль неверный. В доступе отказано. ")
            }
        }

        login != USER_NAME -> println("Пользователь не зарегистрирован. Необходима регистрация.")
    }


}