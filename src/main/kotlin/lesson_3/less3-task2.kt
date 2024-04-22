package org.example.lesson_3

fun main(){
    var firstName = "Андреева"
    var secondName = "Татьяна"
    var patronymic = "Сергеевна"
    var yearsOld = 20
    //знаю что люди меняют и имя и отчество - потому и var

    println("$firstName $secondName $patronymic, $yearsOld лет")

    firstName = "Сидорова"
    yearsOld = 22
    println("$firstName $secondName $patronymic, $yearsOld лет")
}