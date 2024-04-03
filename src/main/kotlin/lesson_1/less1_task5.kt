package org.example.lesson_1
const val SECOND_IN_SPACE = 6480
const val SECOND_IN_HOUR = 3600
const val SECOND_IN_MINUTE = 60
fun main(){

    val hour = (SECOND_IN_SPACE/SECOND_IN_HOUR).toString().padStart(2, '0')
    val minute = ((SECOND_IN_SPACE % SECOND_IN_HOUR) / SECOND_IN_MINUTE).toString().padStart(2, '0')
    val second = (SECOND_IN_SPACE % SECOND_IN_MINUTE).toString().padStart(2, '0')


    println("$hour:$minute:$second")
}

