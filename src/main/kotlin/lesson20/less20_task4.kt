package org.example.lesson20

fun main() {
    val items = listOf("Яблоко", "Апельсин", "Груша", "Банан", "Персик")
    val clickedItems = items.mapIndexed { index, item ->
        if (index % 2 != 0) {
            { println("Нажат элемент $item") }
        } else {
            {}
        }
    }
    for (clickedItem in clickedItems) {
        clickedItem()
    }
}