package org.example.lesson19

enum class Gender {
    MALE,
    FEMALE,
}

data class Person(val name: String, val gender: Gender) {
    override fun toString(): String {
        return "$name - $gender"
    }
}

fun main() {
    println("Введите данные о человеке в формате: имя пол (через пробел)")
    println("Доступные значения пола: м или ж. ПРИМЕР: Света ж")

    val people = mutableListOf<Person>()
    for (i in 1..5) {
        print("Введите данные о человеке $i: ")
        val input = readln().split(" ")
        val name = input[0]
        val gender = when (input[1]) {
            "м" -> Gender.MALE
            "ж" -> Gender.FEMALE
            else -> throw IllegalArgumentException("Неизвестный пол")
        }
        people.add(Person(name, gender))
    }
    println()
    println("Список людей:")
    people.forEach { person ->
        println("$person")
    }
}