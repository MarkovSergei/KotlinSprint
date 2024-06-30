package org.example.lesson17

fun main() {
    val newShip = Ship()
    newShip.printInfo()

    newShip.name = "NewName"
    newShip.port = "Betta"
    newShip.middleSpeed =  15000
    newShip.printInfo()
}

class Ship {
    private val nameShip = "Ship"

    var name: String = nameShip
        get() {
            if (field != nameShip) {
                println("Поменять имя коробля нельзя!")
            }
            return nameShip
        }
    var middleSpeed: Int = 1500
    var port: String = "Alfa"


    fun printInfo() {
        println("Имя коробля: $name; Средняя скорость: $middleSpeed; Порт: $port")
    }

}