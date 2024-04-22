package org.example.lesson5
import java.time.LocalDate

const val AGE_OF_MAJORITY = 18

fun main() {
    print("Введите Ваш год рождения: ")
    val userYearBorn = readln().toInt()
    if (LocalDate.now().year - userYearBorn >= AGE_OF_MAJORITY)
        println("Показать экран со скрытым контентом")
    else println("В доступе отказано!")

}