package org.example.lesson20

data class Player1(
    val name: String,
    val hasKey: Boolean,
)

val checkDoor: (Player1) -> Unit = { p ->
    if (p.hasKey) {
        println("${p.name} открыл дверь")
    } else {
        println("Дверь заперта")
    }
}

fun main() {
    val player = Player1("Анатолий", true)
    checkDoor(player)
}