package org.example.lesson3

fun main() {
    val dataString = "D2-D4;0"

    val whereFrom = dataString.substringBefore("-")
    val where = dataString.substringAfter("-").substringBefore(";")
    val strokeNumber = dataString.substringAfter(";")

    println(whereFrom)
    println(where)
    println(strokeNumber)
}
