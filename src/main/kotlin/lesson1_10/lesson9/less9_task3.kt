package org.example.lesson1_10.lesson9

fun main() {
    val listIngPortion = listOf(2, 50, 15)
    print("Сколько порций: ")
    val userInputPortion = readln().toInt()
    val newListIngPortion = listIngPortion.map { it * userInputPortion }
    println(
        "На [$userInputPortion] порций вам понадобится: " +
                "Яиц – [${newListIngPortion[0]}], " +
                "молока – [${newListIngPortion[1]}], " +
                "сливочного масла – [${newListIngPortion[2]}]"
    )
}