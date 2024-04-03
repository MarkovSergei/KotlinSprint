package org.example.lesson_2
import kotlin.math.pow


fun main() {
    val principal = 70000.0
    val rate = 0.167
    val years = 20.0

    val deposit = principal * (1 + rate).pow(years)

    val formattedDeposit = String.format("%.3f", deposit)
    println(formattedDeposit)
}