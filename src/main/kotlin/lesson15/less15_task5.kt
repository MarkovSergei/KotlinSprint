package org.example.lesson15

fun main() {
    val fordFocus = PassengerCarClass()
    val scaniaTruck = Truck()
    val toyotaCamry = PassengerCarClass()

    fordFocus.loadCar(3, 0)
    fordFocus.movingCar(3, 0)
    fordFocus.unloadCar(3, 0)

    scaniaTruck.loadCar(1, 2)
    scaniaTruck.movingCar(1, 2)
    scaniaTruck.unloadCar(1, 2)

    toyotaCamry.loadCar(2, 0)
    toyotaCamry.movingCar(2, 0)
    toyotaCamry.unloadCar(2, 0)

    println("Всего перевезено грузов: ${fordFocus.cargoWeight + scaniaTruck.cargoWeight + toyotaCamry.cargoWeight} тонн")
    println("Всего перевезено пассажиров: ${fordFocus.passengers + scaniaTruck.passengers + toyotaCamry.passengers}")
}

interface Car {
    fun movingCar(passengers: Int, cargoWeight: Int)
    fun loadCar(passengers: Int, cargoWeight: Int): Int
    fun unloadCar(passengers: Int, cargoWeight: Int)
    var passengers: Int
    var cargoWeight: Int
}

class PassengerCarClass(override var passengers: Int = 0, override var cargoWeight: Int = 0) : Car {
    override fun loadCar(passengers: Int, cargoWeight: Int): Int {
        this.passengers = passengers
        this.cargoWeight = cargoWeight
        println("Человек загружено в легковое авто: $passengers")
        println("Легковое авто груз не перевозит")
        return 0
    }

    override fun movingCar(passengers: Int, cargoWeight: Int) {
        println("Сейчас в пути в легковом авто $passengers")
    }

    override fun unloadCar(passengers: Int, cargoWeight: Int) {
        println("Выгружено $passengers пассажиров")
        println()
    }
}

class Truck(override var passengers: Int = 0, override var cargoWeight: Int = 0) : Car {
    override fun movingCar(passengers: Int, cargoWeight: Int) {
        println("Грузовик в пути")
    }

    override fun loadCar(passengers: Int, cargoWeight: Int): Int {
        this.passengers = passengers
        this.cargoWeight = cargoWeight
        println("Человек загружено в грузовик: $passengers")
        if (cargoWeight > 2) {
            println("Грузовик может перевести только 2 тонны")
        } else {
            println("Тонн заргружено в грузовик: $cargoWeight")
        }
        return cargoWeight
    }

    override fun unloadCar(passengers: Int, cargoWeight: Int) {
        println("Грузовик выгрузил $passengers человек и $cargoWeight тонн груза ")
    }
}
