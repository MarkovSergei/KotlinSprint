package org.example.lesson12

fun main() {
    val weatherData4 = WeatherDataKelvin1(
        298,
        289,
        false
    )
}

class WeatherDataKelvin1(
    dayTemperatureInKelvin: Int,
    nightTemperatureInKelvin: Int,
    precipitation: Boolean = false
) {
    private var dayTemperature: Int = 0
    private var nightTemperature: Int = 0

    init {
        val dayTemperatureInCelsius = dayTemperatureInKelvin - 273
        val nightTemperatureInCelsius = nightTemperatureInKelvin - 273
        this.dayTemperature = dayTemperatureInCelsius
        this.nightTemperature = nightTemperatureInCelsius
    }

    init {
        println("Температура днём: $dayTemperature °C")
        println("Температура ночью: $nightTemperature °C")
        println("Осадки: $precipitation")
        println()
    }
}

