package org.example.lesson22


class RegularBook1(
    val name: String,
    val author: String,
)

data class DataBook1(
    val name: String,
    val author: String,
)

fun main() {
    val regularBook1 = RegularBook1("New1", "Author1")
    val dataBook1 = DataBook1("New2", "Author2")

    println(regularBook1)
    println(dataBook1)

}