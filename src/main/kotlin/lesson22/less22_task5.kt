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

    println("Название: ${alphaCentauri.name}")
    println("Описание: ${alphaCentauri.description}")
    println("Дата: ${alphaCentauri.date}")
    println("Расстояние: ${alphaCentauri.distance} световых лет")
}