package org.example.lesson19

fun main() {
    val newShip = Spaceship()
    newShip.land()
    newShip.launch()
    newShip.shootAtAsteroid()

}

class Spaceship {
    fun launch() {
        TODO("Сделать функцию launch")
    }

    fun land() {
        println("Корабль приземлился")
    }

    fun shootAtAsteroid() {
        throw NotImplementedError("Метод shootAtAsteroid не реализован.")
    }
}