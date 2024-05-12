package org.example.lesson10

fun generatePassword(length: Int): String {
    val digits = '0'..'9'
    val specialChars = "!\"#$%&'()*+,-./ "
    val password = StringBuilder()

    for (i in 0 until length) {
        if (i % 2 == 0) {
            password.append(digits.random())
        } else {
            password.append(specialChars.random())
        }
    }

    return password.toString()
}

fun main() {
    print("Введите желаемую длину пароля:")
    val length = readln().toInt()
    val password = generatePassword(length)
    println("Сгенерированный пароль: $password")
}