package org.example.lesson19

fun main() {
    println("Доступные виды рыб:")
    val fishList = Fish.entries.toTypedArray()
    for (fish in fishList) {
        println(fish.fishName)
    }
}

enum class Fish(var fishName: String) {
    GUPPY("Гуппи"),
    ANGELFISH("скалярия"),
    GOLDFISH("золотая рыбка"),
    SIAMESEFIGHTING("петушок"),
}

