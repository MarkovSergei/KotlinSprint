package org.example.lesson22

import java.util.*

data class GalacticGuide(
    val name: String,
    val description: String,
    val date: Date,
    val distance: Double,
)

fun main() {
    val alphaCentauri = GalacticGuide(
        "Alpha Centauri",
        "Ближайшая к Земле звёздная система, состоящая из трёх звёзд.",
        Date(),
        4.37
    )

    println("Название: ${alphaCentauri.component1()}")
    println("Описание: ${alphaCentauri.component2()}")
    println("Дата: ${alphaCentauri.component3()}")
    println("Расстояние: ${alphaCentauri.component4()} световых лет")
}