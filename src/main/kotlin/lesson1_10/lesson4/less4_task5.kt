package org.example.lesson1_10.lesson4

const val MINOR_DAMAGE_TO_SHIP_TRUE = true
const val MIN_CREW = 55
const val MAX_CREW = 70
const val MIN_BOXES_OF_PROVISIONS = 50
const val FAVORABLE_WEATHER_CONDITIONS_TRUE = true

fun main() {

    val minorDamageToShip = true
    val numberOfCrew = 70
    val boxesOfProvisions = 55
    val favorableWeatherConditions = false

    println(
        "Корабль отпраится в плавание? " +
                "${
                    minorDamageToShip == !MINOR_DAMAGE_TO_SHIP_TRUE &&
                            numberOfCrew >= MIN_CREW &&
                            numberOfCrew <= MAX_CREW &&
                            boxesOfProvisions > MIN_BOXES_OF_PROVISIONS ||

                            minorDamageToShip == MINOR_DAMAGE_TO_SHIP_TRUE &&
                            favorableWeatherConditions == FAVORABLE_WEATHER_CONDITIONS_TRUE &&
                            numberOfCrew == MAX_CREW &&
                            boxesOfProvisions > MIN_BOXES_OF_PROVISIONS
                }"
    )

}