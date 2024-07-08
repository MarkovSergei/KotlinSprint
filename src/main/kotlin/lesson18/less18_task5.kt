package org.example.lesson18

fun main() {
    val screen = Screen()

    screen.draw(Point(1.0f, 2.0f))
    screen.draw(Square(3.0f, 4.0f))
    screen.draw(Circle(6.0f, 7.0f))

    screen.draw(Point(10, 20))
    screen.draw(Square(20, 20))
    screen.draw(Circle(6, 7))
}

class Point(private val x: Number, private val y: Number) {
    fun getX(): Number = x
    fun getY(): Number = y
}

class Square(private val x: Number, private val y: Number) {
    fun getX(): Number = x
    fun getY(): Number = y
}

class Circle(private val x: Number, private val y: Number) {
    fun getX(): Number = x
    fun getY(): Number = y
}

class Screen {

    fun draw(point: Point) {
        println("Рисуем точку с координатами (${point.getX()}, ${point.getY()})")
    }

    fun draw(square: Square) {
        println("Рисуем квадрат с координатами (${square.getX()}, ${square.getY()})")
    }

    fun draw(circle: Circle) {
        println("Рисуем круг с координатами (${circle.getX()}, ${circle.getY()})")
    }
}