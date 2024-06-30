package org.example.lesson16

import kotlin.system.exitProcess

fun main() {
    val player1 = Player("Вася", 100, 23)
    val player2 = Player("Петя", 100, 35)
    player1.takeDamage(player2)
    player2.takeDamage(player1)
    player1.treat(10)
    player1.takeDamage(player2)
    player1.takeDamage(player2)
    player1.takeDamage(player2)
    player1.takeDamage(player2)
    player1.takeDamage(player2)
    player1.takeDamage(player2)
    player1.takeDamage(player2)
    player1.takeDamage(player2)
    player1.takeDamage(player2)
    player1.takeDamage(player2)
    player1.takeDamage(player2)
}

class Player(
    val name: String,
    private var health: Int,
    private var impactForce: Int,
) {
    fun treat(increaseHealth: Int): Int {
        if (health > 0) {
            health += increaseHealth
            println("после лечения здоровье $name - $health")
            return health
        } else {
            return health
        }
    }

    fun takeDamage(otherPlayer: Player): Int {
        otherPlayer.health -= impactForce
        println("$name нанес урон ${otherPlayer.name} на $impactForce пунктов. Здоровье ${otherPlayer.name} - ${otherPlayer.health}")
        if (otherPlayer.health <= 0) {
            die(otherPlayer)
        }
        return otherPlayer.health
    }

    private fun die(otherPlayer: Player) {
        otherPlayer.health = 0
        otherPlayer.impactForce = 0
        println("${otherPlayer.name} - погиб.")
        println("$name - здоровья $health")
        exitProcess(0)
    }
}