package org.example.lesson13

fun main() {
    val contactList = mutableListOf<Contact3>()

    while (true) {
        println("1 - записать новый контакт")
        println("2 - распечатать все контакты")
        print("Выберите действие: ")
        val userInput = readln()
        println()

        if (userInput == "1") {
            print("Введите имя: ")
            val name = readln()
            print("Введите компанию: ")
            val company = readln().takeIf { it.isNotBlank() }
            print("Введите номер телефона: ")
            val telNumber = readln().toLongOrNull()
            println()

            if (telNumber != null) {
                contactList.add(Contact3(name, telNumber, company))
            } else {
                println("Не заполнено поле Телефон, контакт не добавлен.")
                println()
            }
        } else break
    }
    contactList.forEach { it.printUserContact() }
}

class Contact3(
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

