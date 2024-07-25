package org.example.lesson21

fun main() {
    val string = "Hello, World!"
    println("Количество гласных букв в строке \"$string\" равно ${string.vowelCount()}")
}


fun String.vowelCount(): Int {
    val vowels = setOf('a', 'e', 'i', 'o', 'u')
    return count { vowels.contains(it.lowercaseChar()) }
}