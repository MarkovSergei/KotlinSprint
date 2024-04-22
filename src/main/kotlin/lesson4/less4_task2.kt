package org.example.lesson4

fun main() {
    val averageWeightMin = 35
    val averageWeightMax = 100
    val averageVolumeMax = 100

    var cargoWeight = 20
    var cargoVolume = 80

    println("Груз с весом $cargoWeight кг и объемом $cargoVolume л соответствует категории 'Average': " +
            "${cargoWeight >= averageWeightMin && cargoWeight <= averageWeightMax && cargoVolume < averageVolumeMax}")

    cargoWeight = 50
    cargoVolume = 100

    println("Груз с весом $cargoWeight кг и объемом $cargoVolume л соответствует категории 'Average': " +
            "${cargoWeight >= averageWeightMin && cargoWeight <= averageWeightMax && cargoVolume < averageVolumeMax}")
}
