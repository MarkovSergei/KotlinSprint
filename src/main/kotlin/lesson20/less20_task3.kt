package org.example.lesson20

data class Player(
    val name: String,
    val hasKey: Boolean,
)

val checkDoor: (Player) -> Unit = { p ->
    if (p.hasKey) {
        println("${p.name} открыл дверь")
    } else {
        println("Дверь заперта")
    }
}

fun main() {
    val player = Player("Анатолий", true)
    checkDoor(player)
}