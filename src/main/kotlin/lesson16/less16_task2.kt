package org.example.lesson16

fun main() {
    val circle = Circle(100)
    circle.measureCircumference()
    circle.measureAreaOfCircle()

}

class Circle(private val radius: Int) {
    private val pi: Double = 3.14

    fun measureCircumference() {
        val circumference = 2 * pi * radius
        println("Длина окружности с радиусом $radius см = $circumference см")
    }

    fun measureAreaOfCircle() {
        val areaCircle = pi*(radius*radius)
        println("площадь окружности с радиусом $radius см = $areaCircle см2")
    }
}