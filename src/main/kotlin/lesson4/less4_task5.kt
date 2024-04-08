package org.example.lesson4

fun main() {

    val minorDamageToShip = true
    val numberOfCrew = 70
    val boxesOfProvisions = 55
    val favorableWeatherConditions = false


    println("Корабль отпраится в плавание? " +
                    "${minorDamageToShip == false && 
                    numberOfCrew >=55 && 
                    numberOfCrew <=70 && 
                    boxesOfProvisions > 50 ||
                            
                    minorDamageToShip == true &&
                    favorableWeatherConditions == true &&
                    numberOfCrew == 70 &&
                    boxesOfProvisions > 50        
    }")

}