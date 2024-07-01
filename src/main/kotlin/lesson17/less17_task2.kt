package org.example.lesson17

fun main() {
    val newShip = Ship()
    newShip.printInfo()

    newShip.name = "NewName"
    newShip.port = "Betta"
    newShip.middleSpeed = 15000
    newShip.printInfo()
}

class Ship {
    private val nameShip = "Ship"

    var name: String = nameShip
        set(value) {
            if (value != nameShip) {
                println("Поменять имя корабля нельзя!")
            }
        }

    var middleSpeed: Int = 1500
    var port: String = "Alfa"

    fun printInfo() {
        println("Имя корабля: $name; Средняя скорость: $middleSpeed; Порт: $port")
    }
}