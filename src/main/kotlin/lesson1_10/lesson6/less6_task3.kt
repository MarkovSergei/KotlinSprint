package org.example.lesson1_10.lesson6

fun main() {
    print("На сколько секунд поставить таймер: ")
    var secTimer = readln().toInt()

    while (secTimer > 0) {
        println("Осталось секунд: ${secTimer--}")
        Thread.sleep(1000)
    }
    println("Время вышло")
}