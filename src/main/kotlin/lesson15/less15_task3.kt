package org.example.lesson15

fun main() {
    val newUser = User(2,"User1", "12345")
    newUser.readForum()
    newUser.writeMessage("Привет")

    val newAdmin = Admin(1,"Admin1", "54321")
    newAdmin.writeMessage("Пока")
    newAdmin.deleteUser(1)

}

abstract class ForumUser {
    abstract  val id: Int
    abstract val username: String
    abstract val password: String

    abstract fun readForum()
    abstract fun writeMessage(message: String)
}

class User(override val id: Int, override val username: String, override val password: String): ForumUser() {
    override fun readForum() {
        println("$username читает форум")
    }

    override fun writeMessage(message: String) {
        println("$username пишет сообщение: $message")
    }
}

class Admin(override val id: Int, override val username: String, override val password: String): ForumUser() {
    override fun readForum() {
        println("$username читает форум")
    }

    override fun writeMessage(message: String) {
        println("$username пишет сообщение: $message")
    }

    fun deleteMessage(messageId: Int) {
        println("$username удаляет сообщение с ID $messageId")
    }

    fun deleteUser(userId: Int) {
        println("$username удаляет пользователя с ID $userId")
    }
}