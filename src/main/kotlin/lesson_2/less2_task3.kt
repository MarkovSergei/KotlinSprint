package org.example.lesson_2

const val MINUTE_IN_HOUR = 60
fun main (){

    val hourDeparture = 9
    val minuteDeparture = 39
    val travelTimeMinutes = 457

    val hourAndMinuteDepartureInMinute = hourDeparture * MINUTE_IN_HOUR + minuteDeparture + travelTimeMinutes
    val arrivalTimeHours = hourAndMinuteDepartureInMinute / MINUTE_IN_HOUR
    val arrivalTimeMinutes = hourAndMinuteDepartureInMinute % MINUTE_IN_HOUR

    println("Поезд отправился в $hourDeparture:$minuteDeparture и прибудет в $arrivalTimeHours:$arrivalTimeMinutes")
}