package org.example.lesson12

fun main() {
    val weatherData3 = WeatherData1(
        10,
        8,
        true
    )
    weatherData3.printWeather()
}

class WeatherData1(
    private val dayTemperature: Int,
    private val nightTemperature: Int,
    private val precipitation: Boolean
) {
    fun printWeather() {
        println("Температура днём: $dayTemperature °C")
        println("Температура ночью: $nightTemperature °C")
        println("Осадки: $precipitation")
        println()
    }
}