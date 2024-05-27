package org.example.lesson11.less11_task5

fun main() {

    val newForum = Forum()
    newForum.createNewUser(1, "Вася", "12345")
    newForum.createNewUser(2, "Петя", "67890")

    newForum.createNewMessage(1, 1, "Привет!")
    newForum.createNewMessage(2, 2, "Здорово")
    newForum.createNewMessage(3, 1, "Как дела?")
    newForum.createNewMessage(4, 2, "Нормально")

    newForum.printThread()
}

class Forum {
    private var membersList = mutableListOf<ForumMember>()
    private var messagesList = mutableListOf<ForumMessage>()


    fun createNewUser(userId: Int, userName: String, password: String) {
        if (!membersList.any { it.userId == userId && it.userName == userName }) {
            membersList.add(ForumMember(userId, userName, password))
        }
    }

    fun createNewMessage(messageId: Int, authorId: Int, message: String) {
        messagesList.add(ForumMessage(messageId, authorId, message))
    }

    fun printThread() {
        messagesList.forEach { message ->
            println("${message.messageId}: ${message.message}")
        }
    }
}

data class ForumMember(
    val userId: Int,
    val userName: String,
    val password: String,
)

data class ForumMessage(
    val messageId: Int,
    val authorId: Int,
    val message: String,
)
