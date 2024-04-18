package org.example.lesson5

const val WIN_NUMBER1 = 22
const val WIN_NUMBER2 = 24

fun main() {
    print("Введите первое число от 0 до 42: ")
    val userNumber1 = readln().toInt()
    val usNum1 = userNumber1==WIN_NUMBER1 || userNumber1==WIN_NUMBER2

    print("Введите второе число от 0 до 42: ")
    val userNumber2 = readln().toInt()
    val usNum2 = userNumber2==WIN_NUMBER1 || userNumber2==WIN_NUMBER2

    val winResult = usNum1 && usNum2
    val consolationPrize = usNum1 || usNum2

    if (winResult)
        println("Поздравляем! Вы выиграли главный приз!")
    else if (consolationPrize) {
        println("Вы выиграли утешительный приз!")
        println("Правильные числа $WIN_NUMBER2 и $WIN_NUMBER1")
    }
    else{
        println("Неудача")
        println("Правильные числа $WIN_NUMBER2 и $WIN_NUMBER1")
    }
}