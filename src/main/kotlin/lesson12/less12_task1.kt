package org.example.lesson12

fun main() {
    val weatherData1 = WeatherData()

    weatherData1.dayTemperature = 15
    weatherData1.nightTemperature = 10
    weatherData1.precipitation = false

    val weatherData2 = WeatherData()
    weatherData2.dayTemperature = 25
    weatherData2.nightTemperature = -10
    weatherData2.precipitation = true

    weatherData1.printWeather()
    weatherData2.printWeather()
}

class WeatherData {
    var dayTemperature: Int = 0
    var nightTemperature: Int = 0
    var precipitation: Boolean = false

    fun printWeather() {
        println("Температура днём: $dayTemperature °C")
        println("Температура ночью: $nightTemperature °C")
        println("Осадки: $precipitation")
        println()
    }
}