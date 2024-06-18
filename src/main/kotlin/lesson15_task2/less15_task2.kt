package org.example.lesson15_task2

fun main() {
    val weatherServer = WeatherServer()
    weatherServer.addWeatherData(WeatherServer.Temperature(30))
    weatherServer.addWeatherData(WeatherServer.PrecipitationAmount(50))
    weatherServer.addWeatherData(WeatherServer.Temperature(10))

    weatherServer.sendMessage()
}

abstract class WeatherStationStats {
    abstract fun getData(): String
    abstract fun getType(): String
}

class WeatherServer {
    private val weatherData = mutableListOf<WeatherStationStats>()

    fun addWeatherData(data: WeatherStationStats) {
        weatherData.add(data)
    }

    fun sendMessage() {
        when (weatherData.first().getType()) {
            "temperature" -> {
                for (data in weatherData) {
                    if (data is Temperature) {
                        println(data.getData())
                    }
                }
            }

            "precipitation" -> {
                for (data in weatherData) {
                    if (data is PrecipitationAmount) {
                        println(data.getData())
                    }
                }
            }

            else -> {
                println("Неизвестное сообщение")
            }
        }
    }

    class PrecipitationAmount(private val amount: Int) : WeatherStationStats() {
        override fun getData(): String {
            return "$amount мм осадков"
        }

        override fun getType(): String {
            return "precipitation"
        }
    }

    class Temperature(private val temp: Int) : WeatherStationStats() {
        override fun getData(): String {
            return "$temp градусов Цельсия"
        }

        override fun getType(): String {
            return "temperature"
        }
    }
}