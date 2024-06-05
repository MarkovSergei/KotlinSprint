package org.example.lesson13

fun main() {
    print("Name: ")
    val name = readln()
    print("Phone: ")
    val tel = readln()
    print("Company: ")
    val company = readln().takeIf { it.isNotBlank() }
    println()

    val new = Contact33(name, tel, company)
    new.printUserContact()

}

class Contact33(
    private val name: String,
    private val telNumber: String?,
    private val company: String? = null
) {
    fun printUserContact() {
        var longNumber: Long? = null

        try {
            longNumber = telNumber?.toLong()
        } catch (e: NumberFormatException) {
            println("Ошибка: введенный номер не является числом.")
        }

        println(
            """
            Имя: $name
            Номер: $longNumber
            Компания: ${company ?: "<не указано>"}

            """.trimIndent()
        )
    }
}