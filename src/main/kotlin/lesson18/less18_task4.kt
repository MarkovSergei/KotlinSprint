package org.example.lesson18

fun main() {
    val rectangularPackage = RectangularPackage(10.0, 5.0, 3.0)
    val cubePackage = CubePackage(7.0)

    println("Площадь поверхности прямоугольной упаковки: ${rectangularPackage.calculateSurfaceArea()}")
    println("Площадь поверхности упаковки куба: ${cubePackage.calculateSurfaceArea()}")
}

abstract class Package(
    val length: Double,
    val width: Double,
    val height: Double
) {
    open fun calculateSurfaceArea(): Double {
        return 0.0
    }
}

class RectangularPackage(
    length: Double,
    width: Double,
    height: Double
) : Package(length, width, height) {
    override fun calculateSurfaceArea(): Double {
        return 2 * (length * width + length * height + width * height)
    }
}

class CubePackage(
    private val sideLength: Double
) : Package(sideLength, sideLength, sideLength) {
    override fun calculateSurfaceArea(): Double {
        return 6 * sideLength * sideLength
    }
}

