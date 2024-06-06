package org.example.lesson14

fun main() {

    val liner1 = Liner("Liner1", 50, 1000)
    liner1.printInfo()
    val cargo1 = Cargo("Cargo1", 25, 100, 3000)
    cargo1.printInfo()
    val icebreaker1 = Icebreaker("Icebreaker1", 12, 50)
    icebreaker1.printInfo()
}

open class Liner(
    val name: String,
    val speed: Int,
    val capacity: Int,
) {
    open fun printInfo() {
        println("Имя коробля - $name, Скорость - $speed, Пассажировместимость - $capacity")
    }
}

class Cargo(
    name: String,
    speed: Int,
    capacity: Int,
    private val carrying: Int,
) : Liner(name, speed, capacity) {
    override fun printInfo() {
        println("Имя коробля - $name, Скорость - $speed, Пассажировместимость - $capacity, Грузоподъемность - $carrying")
    }
}

class Icebreaker(
    name: String,
    speed: Int,
    capacity: Int,
    private val iceBreak: Boolean = true,
) : Liner(name, speed, capacity) {
    override fun printInfo() {
        println("Имя коробля - $name, Скорость - $speed, Пассажировместимость - $capacity, Ломает лед - $iceBreak")
    }
}