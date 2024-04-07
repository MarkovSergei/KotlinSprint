package org.example.lesson4
const val TABLES = 13

fun main() {
    val tableReservationsToday = 13
    val tableReservationsTomorrow = 9
    println("[Доступность столиков на сегодня: ${tableReservationsToday < TABLES}]\n[Доступность столиков на завтра: ${tableReservationsTomorrow< TABLES}]")
}