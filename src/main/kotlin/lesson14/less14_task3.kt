package org.example.lesson14

abstract class Figure(val color: String) {
    abstract fun calculateArea(): Double
    abstract fun calculatePerimeter(): Double
}

class Circle(
    color: String,
    private val radius: Double
) : Figure(color) {
    override fun calculateArea(): Double = Math.PI * radius * radius
    override fun calculatePerimeter(): Double = 2 * Math.PI * radius
}

class Rectangle(
    color: String,
    private val width: Double,
    private val height: Double
) : Figure(color) {
    override fun calculateArea(): Double = width * height
    override fun calculatePerimeter(): Double = 2 * (width + height)
}

fun main() {
    val blackFigures = listOf(
        Circle("black", 5.0),
        Rectangle("black", 3.0, 4.0)
    )

    val whiteFigures = listOf(
        Circle("white", 7.0),
        Rectangle("white", 2.0, 6.0)
    )

    println("Сумма периметров черных фигур: ${blackFigures.sumOf { it.calculatePerimeter() }}")
    println("Сумма площадей белых фигур: ${whiteFigures.sumOf { it.calculateArea() }}")
}