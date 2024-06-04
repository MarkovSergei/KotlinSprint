package org.example.lesson12

const val KELVIN = 273

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
    private val dayTemperature: Int = dayTemperatureInKelvin - KELVIN
    private var nightTemperature: Int = nightTemperatureInKelvin - KELVIN

    init {
        println("Температура днём: $dayTemperature °C")
        println("Температура ночью: $nightTemperature °C")
        println("Осадки: $precipitation")
        println()
    }
}

