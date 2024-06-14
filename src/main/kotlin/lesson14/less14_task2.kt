package org.example.lesson14

fun main() {

    val liner1 = Liner1("Liner1")
    val cargo1 = Cargo1("Cargo1")
    val icebreaker1 = Icebreaker1("Icebreaker1")

    liner1.printInfo()
    liner1.submerge()

    cargo1.printInfo()
    cargo1.submerge()

    icebreaker1.printInfo()
    icebreaker1.submerge()
}

open class Liner1(
    open val name: String,
) {
    open val speed: Int = 50
    open val capacity: Int = 1000

    open fun submerge(){
        println("выдвигает горизонтальный трап со шкафута")
    }

    open fun printInfo() {
        println("Имя корабля - $name, Скорость - $speed, Пассажировместимость - $capacity")
    }
}

class Cargo1(
    name: String,

    ) : Liner1(name) {
    private val carrying = 3000
    override val speed = 25
    override val capacity = 100

    override fun printInfo() {
        println("Имя корабля - $name, Скорость - $speed, Пассажировместимость - $capacity, Грузоподъемность - $carrying")
    }
    override fun submerge(){
        println("активирует погрузочный кран")
    }
}

class Icebreaker1(
    name: String,
    private val iceBreak: Boolean = true,
) : Liner1(name) {
    override  val speed = 12
    override  val capacity = 50

    override fun printInfo() {
        println("Имя корабля - $name, Скорость - $speed, Пассажировместимость - $capacity, Ломает лед - $iceBreak")
    }

    override fun submerge(){
        println("открывает ворота со стороны кормы")
    }
}