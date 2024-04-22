package org.example.lesson_2
import kotlin.math.pow


fun main() {
    val principal = 70000
    val percentage = 16.7
    val years = 20

    val rate = percentage / 100
    val deposit = principal * (1 + rate).pow(years)
    val formattedDeposit = String.format("%.3f", deposit)

    println(formattedDeposit)
}