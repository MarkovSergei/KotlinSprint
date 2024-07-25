package org.example.lesson20

fun main() {
    val items = listOf("Яблоко", "Апельсин", "Груша", "Банан", "Персик")
    items.filterIndexed { index, _ -> index % 2 != 0 }.map { item ->
        println("Нажат элемент $item")
    }
}