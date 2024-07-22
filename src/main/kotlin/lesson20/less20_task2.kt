package org.example.lesson20

fun main() {
    val player = Player("Анатолий", 100, 50)
    val healPotion: (Player) -> Unit = {p -> p.currentHealth = p.maxHealth}
    healPotion(player)
    println("Здоровье игрока ${player.name} - ${player.currentHealth}")
}

data class Player(
    val name: String,
    val maxHealth: Int,
    var currentHealth: Int,
)

