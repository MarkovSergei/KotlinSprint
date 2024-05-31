package org.example.lesson12

fun main() {
    val weatherData3 = WeatherDataKelvin(
        293,
        280,
        true
    )
    weatherData3.printWeather()
}

class WeatherDataKelvin {
    private var dayTemperature: Int = 0
    private var nightTemperature: Int = 0
    private var precipitation: Boolean = false

    constructor(
        dayTemperatureInKelvin: Int,
        nightTemperatureInKelvin: Int,
        precipitation: Boolean
    ) {
        val dayTemperatureInCelsius = dayTemperatureInKelvin - 273
        val nightTemperatureInCelsius = nightTemperatureInKelvin - 273

        this.dayTemperature = dayTemperatureInCelsius
        this.nightTemperature = nightTemperatureInCelsius
        this.precipitation = precipitation
    }

    fun printWeather() {
        println("Температура днём: $dayTemperature °C")
        println("Температура ночью: $nightTemperature °C")
        println("Осадки: $precipitation")
        println()
    }
}

