package org.example.lesson18

import java.awt.Graphics


open class Shape(
    val x: Float,
    val y: Float
)

class Point(
    x: Float,
    y: Float
) : Shape(x, y)

class Square(
    x: Float,
    y: Float,
    val size: Float
) : Shape(x, y)

class Circle(
    x: Float,
    y: Float,
    val radius: Float
) : Shape(x, y)

class Screen {
    fun draw(g: Graphics, point: Point) {
        g.fillOval(point.x.toInt(), point.y.toInt(), 1, 1)
    }

    fun draw(g: Graphics, square: Square) {
        g.fillRect(square.x.toInt(), square.y.toInt(), square.size.toInt(), square.size.toInt())
    }

    fun draw(g: Graphics, circle: Circle) {
        g.fillOval(circle.x.toInt(), circle.y.toInt(), (circle.radius * 2).toInt(), (circle.radius * 2).toInt())
    }

}