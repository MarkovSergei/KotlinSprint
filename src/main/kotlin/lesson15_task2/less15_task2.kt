package org.example.lesson15_task2

fun main() {
    val temperature = Temperature(20)
    temperature.serverSend()

    val precipitationAmount = PrecipitationAmount(10)
    precipitationAmount.serverSend()
}

abstract class WeatherStationStats {
    abstract fun serverSend()
}

class PrecipitationAmount  (private val amount: Int): WeatherStationStats() {
    override fun serverSend() {
        println("сегодня выпало $amount мм осадков")
    }
}

class Temperature(private val temp: Int) : WeatherStationStats() {
    override fun serverSend() {
        println ("сейчас $temp градусов")
    }

}
