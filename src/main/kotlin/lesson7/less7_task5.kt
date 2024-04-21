package org.example.lesson7

const val MINIMUM_LENGTH_PASSWORD = 6

fun main() {
    while (true) {
        print("Введите длину пароля (более 6): ")
        val lengthPassword = readln().toInt()

        if (lengthPassword >= MINIMUM_LENGTH_PASSWORD) {
            for (i in lengthPassword downTo 1) {
                val password = listOf('a'..'z', '0'..'9', 'A'..'Z').random().random()
                print("$password")
            }
            break
        } else {
            println("Введите длину пароля больше 6 символов!")
        }
    }
}