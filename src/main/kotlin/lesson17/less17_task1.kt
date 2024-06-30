package org.example.lesson17

fun main() {
    val new = Quiz("Сколько будет 3*3", 9)
    println(new.newQuestion)
    println(new.correctAnswer)
}

class Quiz(
    private val question: String,
    private val answer: Int
) {
    val newQuestion: String
        get() {
            return question
        }

    var correctAnswer: Int
        get() {
            return answer
        }
        set(value) {
        }
}