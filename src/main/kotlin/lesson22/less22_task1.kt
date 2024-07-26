package org.example.lesson22

class RegularBook(
    val name: String,
    val author: String,
)

data class DataBook(
    val name: String,
    val author: String,
)

fun main() {
    val regularBook1 = RegularBook("New1", "Author1")
    val regularBook2 = RegularBook("New1", "Author1")
    val dataBook1 = DataBook("New2", "Author2")
    val dataBook2 = DataBook("New2", "Author2")


    print("Сравнение экземпляров класса RegularBook: ")
    println(regularBook1 == regularBook2)

    print("Сравнение экземпляров класса DataBook: ")
    println(dataBook1.equals(dataBook2))

}