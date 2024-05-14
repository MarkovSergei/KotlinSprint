package org.example.lesson1_10.lesson_1

const val SECOND_IN_HOUR = 3600
const val SECOND_IN_MINUTE = 60

fun main() {
    val secondInSpace = 6480
    val hour = (secondInSpace/SECOND_IN_HOUR)
    val minute = ((secondInSpace % SECOND_IN_HOUR) / SECOND_IN_MINUTE)
    val second = (secondInSpace % SECOND_IN_MINUTE)

    val time = String.format("%02d:%02d:%02d", hour, minute, second)
    println(time)
}

