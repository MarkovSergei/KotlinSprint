package org.example.lesson14

fun main() {

    val liner1 = Liner("Liner1")
    val cargo1 = Cargo("Cargo1")
    val icebreaker1 = Icebreaker("Icebreaker1")

    liner1.printInfo()
    cargo1.printInfo()
    icebreaker1.printInfo()
}

open class Liner(
    open val name: String,
) {
    open val speed: Int = 50
    open val capacity: Int = 1000

    open fun printInfo() {
        println("Имя корабля - $name, Скорость - $speed, Пассажировместимость - $capacity")
    }
}

class Cargo(
    name: String,

) : Liner(name) {
    private val carrying = 3000
    override val speed = 25
    override val capacity = 100

    override fun printInfo() {
        println("Имя корабля - $name, Скорость - $speed, Пассажировместимость - $capacity, Грузоподъемность - $carrying")
    }
}

class Icebreaker(
    name: String,
    private val iceBreak: Boolean = true,
) : Liner(name) {
    override  val speed = 12
    override  val capacity = 50

    override fun printInfo() {
        println("Имя корабля - $name, Скорость - $speed, Пассажировместимость - $capacity, Ломает лед - $iceBreak")
    }
}