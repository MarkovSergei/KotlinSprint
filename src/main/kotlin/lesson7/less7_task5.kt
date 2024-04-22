package org.example.lesson7

const val MINIMUM_LENGTH_PASSWORD = 6
const val FOR_DOWN_TO = 4

fun main() {
    val wordsList = ('a'..'z').toList()
    val bigWordsList = ('A'..'Z').toList()
    val numbersList = ('0'..'9').toList()

    val allChars = ('a'..'z') + ('A'..'Z') + ('0'..'9')
    val allListRandom = "${wordsList.random()}${bigWordsList.random()}${numbersList.random()}"

    while (true) {
        print("Введите длину пароля (более $MINIMUM_LENGTH_PASSWORD): ")
        val lengthPassword = readln().toInt()

        if (lengthPassword >= MINIMUM_LENGTH_PASSWORD) {
            print(allListRandom)
            for (i in lengthPassword downTo FOR_DOWN_TO) {
                print("${allChars.random()}")
            }
            break
        } else {
            println("Введите длину пароля больше $MINIMUM_LENGTH_PASSWORD символов!")
        }
    }
}