package org.example.lesson_1

fun main(){
    val secondInSpace = 6480
    val hour = secondInSpace/3600
    val minute =  (secondInSpace % 3600) / 60
    val second = secondInSpace % 60
    val second1 = second.toString().padStart(2, '0')

    println("$hour:$minute:$second1")
}

