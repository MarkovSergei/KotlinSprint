package org.example.lesson7

const val MINIMUM_LENGTH_PASSWORD = 6
const val FOR_DOWN_TO = 4

fun main() {
    val wordsList = ('a'..'z')
    val bigWordsList = ('A'..'Z')
    val numbersList = ('0'..'9')

    val allChars = wordsList + bigWordsList + numbersList
    val allListRandom = "${wordsList.random()}${bigWordsList.random()}${numbersList.random()}"

    while (true) {
        print("Введите длину пароля (более $MINIMUM_LENGTH_PASSWORD): ")
        val lengthPassword = readln().toInt()

        if (lengthPassword >= MINIMUM_LENGTH_PASSWORD) {
            var pass1 = ""
            for (i in lengthPassword downTo FOR_DOWN_TO) {
                pass1 = pass1 + allChars.random()
            }
            val password = allListRandom + pass1
            print(password)
            break
        } else {
            println("Введите длину пароля больше $MINIMUM_LENGTH_PASSWORD символов!")
        }

    }

}