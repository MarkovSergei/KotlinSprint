package org.example.lesson13


fun main() {
    val contactList = listOf(
        Contact2("Петя", 81234678901),
        Contact2("Вася", 81230986541),
        Contact2("Маша", 81237856412, null),
        Contact2("Даша", 81235511697, "BMW"),
        Contact2("Глаша", 8123, "Toyota"),
    )
    println(contactList.mapNotNull { it.company})
}

class Contact2(
    private val name: String,
    private val telNumber: Long,
    val company: String? = null
) {
    fun printUserContact() {
        println(
            """ 
            - Имя: $name
            - Номер: $telNumber
            - Компания: ${company ?: "<не указано>"}
        """.trimIndent()
        )
    }
}

