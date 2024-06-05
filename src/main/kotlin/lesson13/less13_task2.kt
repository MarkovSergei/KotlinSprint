package org.example.lesson13

fun main() {
    val firstContact = Contact1(
        "Петя",
        89991112233,
    )
}

class Contact1(
    name: String,
    telNumber: Long,
    company: String? = null
) {
    init {
        println(
            "Имя - $name\n" +
                    "Номер телефона - $telNumber\n" +
                    "Компания - ${company ?: "<не указано>"}"
        )
    }
}