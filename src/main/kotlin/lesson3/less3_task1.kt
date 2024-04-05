package org.example.lesson3

fun main(){
    val userName = "Дмитрий"
    val greetingDay = "Добого дня, "
    val greetingEvening = "Добрый вечер, "

    var greeting = "$greetingDay$userName!"
    println(greeting)

    greeting = "$greetingEvening$userName!"
    println(greeting)
    //надеюсь я правильно понял смысл задачи
}
