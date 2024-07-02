package org.example.lesson17

fun main() {
    val newParcel = Parcel(1, "Москва")
    newParcel.parcelLocation = "Тверь"
    newParcel.parcelLocation = "Пемза"
    newParcel.parcelLocation = "Иркутск"
    newParcel.printInfo()
}

class Parcel(
    private val parcelId: Int,
    location: String,
) {
    private var locationCount = 0
    var parcelLocation: String = location
        set(value) {
            if (value != parcelLocation) {
                locationCount++
            }
            field = value
        }

    fun printInfo() {
        println("Посылка ID # $parcelId в $parcelLocation. Кол-во перемещений: $locationCount")
    }
}