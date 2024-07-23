package org.example.lesson20

class Robot {
    private val phrases = listOf(
        "Привет, как дела?",
        "Сегодня прекрасная погода",
        "Я люблю программировать на Kotlin",
        "Давай поиграем в шахматы",
        "У меня есть интересная книга"
    )

    fun setModifier(modifier: (String) -> String) {
        this.modifier = modifier
    }

    private var modifier: (String) -> String = { it }

    fun say() {
        val randomPhrase = phrases.random()
        val modifiedPhrase = modifier(randomPhrase)
        println(modifiedPhrase)
    }
}

fun main() {
    val robot = Robot()
    robot.say()
    robot.setModifier { it.reversed() }
    robot.say()
    robot.say()
    robot.setModifier { it }
    robot.say()
    robot.say()
}