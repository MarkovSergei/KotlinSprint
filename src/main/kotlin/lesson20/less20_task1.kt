package org.example.lesson20

fun main() {
    val userName = "Анатолий"
    val greeting: () -> String = {"С наступающим новым годом, $userName"}
    println(greeting())

}