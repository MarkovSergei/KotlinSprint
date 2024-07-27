package org.example.lesson21

import java.io.File

fun main() {
    val fileName = "dict.txt"
    val word = "Hello"

    val file = File(fileName)
    file.writeWordToFile(word)
}

fun File.writeWordToFile(word: String) {
    word.lowercase().let {
        this.writeText(it)
    }
}