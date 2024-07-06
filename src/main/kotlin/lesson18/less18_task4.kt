package org.example.lesson18

fun main() {
    val rectangularPackage = RectangularPackage(10.0, 5.0, 3.0)
    val cubePackage = CubePackage(7.0)

    println("Площадь поверхности прямоугольной упаковки: ${rectangularPackage.calculateSurfaceArea()}")
    println("Площадь поверхности упаковки куба: ${cubePackage.calculateSurfaceArea()}")
}

open class Package(
    private val length: Double,
    private val width: Double,
    private val height: Double
) {
    open fun calculateSurfaceArea(): Double {
        return 2 * (length * width + length * height + width * height)
    }
}

class RectangularPackage(
    length: Double,
    width: Double,
    height: Double
) : Package(length, width, height)

class CubePackage(
    sideLength: Double
) : Package(sideLength, sideLength, sideLength)

