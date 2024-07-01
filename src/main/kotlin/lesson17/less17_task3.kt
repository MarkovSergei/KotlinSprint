package org.example.lesson17

fun main() {
    val hiddenFolder = Folder("secret", 77, true)
    hiddenFolder.printInfo()
    val normalFolder = Folder("normal", 66)
    normalFolder.printInfo()
}

class Folder(
    val name: String,
    private val numberOfFiles: Int,
    private val isSecret: Boolean = false
) {

    private val secretName: String
        get() = if (isSecret) "скрытая папка" else name

    private val secretNumberOfFiles: Int
        get() = if (isSecret) 0 else numberOfFiles

    fun printInfo() {
        println("Имя папки: $secretName - $secretNumberOfFiles файлов")
    }

}

