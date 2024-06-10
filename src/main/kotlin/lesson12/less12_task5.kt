package org.example.lesson12

import java.util.*

fun main() {

    val weatherValueList = mutableListOf<WeatherValueClass>()
    val tempValue = (-30..30)

    val random = Random()
    for (i in 30 downTo 1) {
        weatherValueList.add(
            WeatherValueClass(
                tempValue.random(),
                tempValue.random(),
                random.nextBoolean()
            )
        )
    }
    val listDayTemp = weatherValueList.map { it.dayTemperature }
    val listOfNightTemp = weatherValueList.map { it.nightTemperature }
    val listPrecipitation = weatherValueList.map { it.isPrecipitation }.filter { it }

    println(
        """
        Средняя температура днём: ${listDayTemp.average().toInt()}
        Средняя температура ночью: ${listOfNightTemp.average().toInt()}
        Дней с осадками: ${listPrecipitation.count()}     
    """.trimIndent()
    )
}

class WeatherValueClass(
    val dayTemperature: Int,
    val nightTemperature: Int,
    val isPrecipitation: Boolean
)