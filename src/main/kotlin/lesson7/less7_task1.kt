package org.example.lesson7

fun main() {

    for (i in 6 downTo 1) {
        val password = listOf('a'..'z', '0'..'9').random().random()
        print("$password")
    }
}