package org.example.lesson6

fun main() {
    print("На сколько секунд поставить таймер: ")
    val secTimer = readln().toInt()
    Thread.sleep(secTimer.toLong() * 1000)
    println("Прошло $secTimer секунд")
}