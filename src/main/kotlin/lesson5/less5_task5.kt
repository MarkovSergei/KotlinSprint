package org.example.lesson5

fun main() {
    val random1 = (0..42).random()
    val random2 = (0..42).random()
    val random3 = (0..42).random()

    val winNumberList = listOf(random1, random2, random3)

    print("Введите число от 0 до 42: ")
    val userNumber1 = readln().toInt()

    print("Введите число от 0 до 42: ")
    val userNumber2 = readln().toInt()

    print("Введите число от 0 до 42: ")
    val userNumber3 = readln().toInt()

    val userNumberList = listOf(userNumber1, userNumber2, userNumber3)

    val winList = winNumberList.intersect(userNumberList.toSet())
    val listCount = winList.count()
    println()

    when (listCount) {
        3 -> println("Вы угадали все числа и выиграли джекпот")
        2 -> println("Вы угадали два числа и получаете крупный приз.")
        1 -> println("Вы угадали 1 число и получаете утешительный приз.")
        0 -> println("Вы не угадали ни одного числа.")
    }
    println("Выйгрышные числа: $random1, $random2, $random3")


}