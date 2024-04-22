package org.example.lesson4

const val SUN_TODAY = true
const val AWNING_OPEN = true
const val AIR_HUMIDITY = 20
const val SEASON = "зима"

fun main() {
    val isSunny = true
    val isAwningOpen = true
    val airHumidity = 20
    val season = "не зима"

    println(
        "Благоприятные ли условия сейчас для роста бобовых? " +
                "${
                    SUN_TODAY == isSunny &&
                            AWNING_OPEN == isAwningOpen &&
                            airHumidity == AIR_HUMIDITY &&
                            SEASON == season
                }"
    )
}
