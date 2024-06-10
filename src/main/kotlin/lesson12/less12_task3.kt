package org.example.lesson12

const val KELVIN: Int = 273

fun main() {
    val weatherData3 = WeatherDataKelvin(
        283,
        280,
        true
    )
    weatherData3.printWeather()
}

class WeatherDataKelvin(
    dayTemperatureInKelvin: Int,
    nightTemperatureInKelvin: Int,
    private val precipitation: Boolean = false,
) {
    private val dayTemperatureInCelsius = dayTemperatureInKelvin - KELVIN
    private val nightTemperatureInCelsius = nightTemperatureInKelvin - KELVIN


    fun printWeather() {
        println("Температура днём: $dayTemperatureInCelsius °C")
        println("Температура ночью: $nightTemperatureInCelsius °C")
        println("Осадки: $precipitation")
        println()
    }
}

