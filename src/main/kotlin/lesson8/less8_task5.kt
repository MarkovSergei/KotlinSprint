package org.example.lesson8

fun main() {
    print("Сколько ингредиентов будет в блюде: ")
    val ingUserArray = Array(readln().toInt()) { readln() }
    println(ingUserArray.contentToString())
}