package org.example.lesson4

fun main() {
    val weatherTodaySunny = true
    val tentOpen = true
    val airHumidity = 20
    val season = "зима"


    println("Благоприятные ли условия сейчас для роста бобовых? " +
            "${weatherTodaySunny == true && 
                    tentOpen == true && 
                    airHumidity == 20 && 
                    season == "не зима"}")
}
