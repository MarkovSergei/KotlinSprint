package org.example.lesson_2

fun main (){
    val minuteInHour = 60
    val hourDeparture = 9
    val hourInMinuteDeparture = hourDeparture * minuteInHour
    val minuteDeparture = 39
    val hourAndMinuteDepartureInMinute = hourInMinuteDeparture + minuteDeparture
    val travelTimeMinutes = 457
    val arrivalTimeHours = (hourAndMinuteDepartureInMinute + travelTimeMinutes) / minuteInHour
    val arrivalTimeMinutes = (hourAndMinuteDepartureInMinute + travelTimeMinutes) % minuteInHour
    println("Поезд отправился в $hourDeparture:$minuteDeparture и прибудет в $arrivalTimeHours:$arrivalTimeMinutes")
}