package org.example.lesson22

data class Person(
    val name: String,
    val age: Int,
    val city: String
)

fun main() {
    val person = Person("Сеня", 30, "Москва")
    val (name, age, city) = person

    println("Имя: $name")
    println("Возраст: $age")
    println("Город: $city")
}