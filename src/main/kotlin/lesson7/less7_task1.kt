package org.example.lesson7

const val PASSWORD_SIM = 6

fun main() {

    val wordList = ('a'..'z').toList()
    val numberList = ('0'..'9').toList()

    for (i in PASSWORD_SIM downTo 4) {
        val words = wordList.random()
        val number = numberList.random()
        print("$words$number")
    }
}