package org.example.lesson6

fun main() {
    print("На сколько секунд поставить таймер: ")
    var secTimer = readln().toInt()
    val second = secTimer

    while (secTimer > 0) {
        println("${secTimer--}")
        Thread.sleep(1000)
    }
    println("Прошло $second секунд")
    readLine()
}