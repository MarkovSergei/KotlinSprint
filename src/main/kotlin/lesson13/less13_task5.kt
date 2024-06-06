package org.example.lesson13

fun main() {
    print("Name: ")
    val name = readln()
    print("Phone: ")
    val tel = readln()

    var longNumber: Long = 0
    try {
        longNumber = tel.toLong()
    } catch (e: NumberFormatException) {
        println("Ошибка: введенный номер не является числом.")
        return
    }

    print("Company: ")
    val company = readln().takeIf { it.isNotBlank() }
    println()

    val new = Contact33(name, longNumber, company)
    new.printUserContact()

}

class Contact33(
    private val name: String,
    private val telNumber: Long,
    private val company: String? = null
) {
    fun printUserContact() {
        println(
            """
            Имя: $name
            Номер: $telNumber
            Компания: ${company ?: "<не указано>"}

            """.trimIndent()
        )
    }
}