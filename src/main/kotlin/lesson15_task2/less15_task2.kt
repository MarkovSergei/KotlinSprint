package org.example.lesson15_task2

fun main() {
    val weatherServer = WeatherServer()
    weatherServer.addWeatherData(Temperature(20))
    weatherServer.addWeatherData(PrecipitationAmount(50))

    weatherServer.addWeatherData(Temperature(30))

    weatherServer.sendMessage("temperature")
    weatherServer.sendMessage("precipitation")
}

abstract class WeatherStationStats {
    abstract fun getData(): String
}

class WeatherServer {
    private val weatherData = mutableListOf<WeatherStationStats>()

    fun addWeatherData(data: WeatherStationStats) {
        weatherData.add(data)
    }

    fun sendMessage(messageType: String) {
        when (messageType) {
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
