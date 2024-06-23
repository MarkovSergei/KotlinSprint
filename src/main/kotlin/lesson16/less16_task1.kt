package org.example.lesson16
import java.util.*


fun main() {
    val randomNumber = Kubic()
    randomNumber.randomNumberPrint()
}

class Kubic {
    private val randomNumber = Random().nextInt(1, 7)

    fun randomNumberPrint(){
        println("Выпало число $randomNumber")
    }
}