package org.example.lesson17

fun main() {
    val newParcel = Parcel(1, "Москва")
    newParcel.parcelLocation = "Тверь"
    newParcel.parcelLocation = "Пемза"
    newParcel.printInfo()

}

class Parcel(
    private val parcelId: Int,
    var parcelLocation: String,
) {
    private var locationCount = 1
    var location: String = parcelLocation
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