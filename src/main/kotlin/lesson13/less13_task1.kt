package org.example.lesson13

fun main() {
    val firstContact = Contact(
        "Петя",
        89991112233,
        null
    )
}

class Contact(
    name: String,
    telNumber: Long,
    company: String?,
) {
    init {
        println("Имя - $name")
        println("Номер телефона - $telNumber")
        println("Компания - $company")
        println()
    }
}