package org.example.lesson_2

fun main() {
    val crystals = 7
    val iron = 11
    val percentageBuff = 20

    val buffCoefficient = (percentageBuff.toFloat() + 100.0f) / 100f
    val buffedCrystals = crystals * buffCoefficient
    val buffedIron = iron * buffCoefficient

    println("Бонусы за кристаллическую руду: ${"%.0f".format(buffedCrystals - crystals)}")
    println("Бонусы за железную руду: ${"%.0f".format(buffedIron - iron)}")

}