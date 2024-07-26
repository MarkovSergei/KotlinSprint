package org.example.lesson21

data class Player33(
    val name: String,
    val maxHealth: Int,
    var currentHealth: Int,
)

fun Player33.isHealthy(): Boolean {
    return currentHealth == maxHealth
}
