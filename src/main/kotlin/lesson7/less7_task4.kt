package org.example.lesson7

fun main() {
    print("Сколько секунд засечь: ")
    var timerUserInput = readln().toInt()
    for (i in timerUserInput downTo 1) {
        print("${timerUserInput--}-")
        Thread.sleep(1000)
    }
    print("Время вышло!")
}