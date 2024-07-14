package org.example.lesson19

enum class Fish {
    GUPPY,
    ANGELFISH,
    GOLDFISH,
    SIAMESEFIGHTINGFISH,
}

fun setFish(fish: Fish) {
    when (fish) {
        Fish.GUPPY -> println("Гуппи")
        Fish.ANGELFISH -> println("скалярия")
        Fish.GOLDFISH -> println("золотая рыбка")
        Fish.SIAMESEFIGHTINGFISH -> println("петушок")
    }
}

fun main() {
    println("Доступные виды рыб:")
    val fishList = listOf(Fish.GUPPY, Fish.ANGELFISH, Fish.GOLDFISH, Fish.SIAMESEFIGHTINGFISH)
    fishList.forEach { fish ->
        setFish(fish)
    }
}