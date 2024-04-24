package org.example.lesson7

fun main() {
    print("Введите число: ")
    var userInput = readln().toInt()
    if (userInput % 2 != 0) {
        userInput--
        for (i in 0..userInput step 2) {
            print("$i ")
        }
    } else {
        for (i in 0..userInput step 2) {
            print("$i ")
        }
    }
}
