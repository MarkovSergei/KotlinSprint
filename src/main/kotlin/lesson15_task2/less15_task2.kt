package org.example.lesson15_task2

fun main() {
    val weatherServer = WeatherServer()
    weatherServer.addWeatherData(WeatherServer.Temperature(30))
    weatherServer.addWeatherData(WeatherServer.PrecipitationAmount(50))
    weatherServer.addWeatherData(WeatherServer.Temperature(10))
}

abstract class WeatherStationStats {
    abstract fun getData(): String
}

class WeatherServer {
    private val weatherData = mutableListOf<WeatherStationStats>()

    fun addWeatherData(data: WeatherStationStats) {
        weatherData.add(data)

        when (data) {
            is Temperature -> println(data.getData())
            is PrecipitationAmount -> println(data.getData())
            else -> println("Неизвестное сообщение")
        }
    }

    class PrecipitationAmount(private val amount: Int) : WeatherStationStats() {
        override fun getData(): String {
            return "$amount мм осадков"
        }
    }

    class Temperature(private val temp: Int) : WeatherStationStats() {
        override fun getData(): String {
            return "$temp градусов Цельсия"
        }
    }
}