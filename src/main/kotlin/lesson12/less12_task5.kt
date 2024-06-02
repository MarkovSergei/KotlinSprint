package org.example.lesson12
import kotlin.math.roundToInt
import kotlin.random.Random

fun main() {

    val dayWeatherMonthList =  List(30) { Random.nextInt(0, 21) }
    val nightWeatherMonthList =  List(30) { Random.nextInt(-10, 21) }
    val precipitationMonthList =  List(30) { Random.nextBoolean() }


    val weatherData5 = WeatherDataKelvin11(
        dayWeatherMonthList,
        nightWeatherMonthList,
        precipitationMonthList
    )
}

class WeatherDataKelvin11(
    dayWeatherMonthList: List<Int>,
    nightWeatherMonthList: List<Int>,
    precipitationMonthList: List<Boolean>,
) {
    private val middleDayTemperature = dayWeatherMonthList.average().roundToInt()
    private val middleNightTemperature = nightWeatherMonthList.average().roundToInt()
    private val sumPrecipitationInMonth = precipitationMonthList.countTrue()

    init {
        println("Средняя Температура днём: $middleDayTemperature °C")
        println("Средняя Температура ночью: $middleNightTemperature °C")
        println("Количество дней с осадками: $sumPrecipitationInMonth")
        println()
    }

    private fun List<Boolean>.countTrue(): Int {
        return this.filter { it }.size
    }
}