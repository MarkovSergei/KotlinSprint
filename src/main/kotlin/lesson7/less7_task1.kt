package org.example.lesson7

const val PASSWORD_SIM = 6
const val FOR_DOWN_TO = 4

fun main() {

    val wordList = ('a'..'z').toList()
    val numberList = ('0'..'9').toList()

    for (i in PASSWORD_SIM downTo FOR_DOWN_TO) {
        val words = wordList.random()
        val number = numberList.random()
        print("$words$number")
    }
}