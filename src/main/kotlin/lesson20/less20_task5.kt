package org.example.lesson20

class Robot {
    fun say(phrase: String) {
        println(phrase)
    }

    fun setModifier(modifier: (String) -> String) {
        this.modifier = modifier
    }

    private var modifier: (String) -> String = { it }
}

fun main() {
    val robot = Robot()
    val phrases = listOf(
        "Привет, как дела?",
        "Сегодня прекрасная погода",
        "Я люблю программировать на Kotlin",
        "Давай поиграем в шахматы",
        "У меня есть интересная книга"
    )

    val randomPhrase = phrases.random()
    robot.say(randomPhrase)
    robot.setModifier { it.reversed() }
    robot.say(randomPhrase)
}