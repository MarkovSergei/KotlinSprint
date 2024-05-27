package org.example.lesson11.less11_task5

fun main() {
    val userId = 1
    val userName = "Вася"

    val newUser = Forum(userId, userName)
    newUser.createNewUser(userId, userName)
}

class Forum(
    userId: Int,
    userName: String,
) {
    var membersList = mutableListOf<ForumMember>()
    var messagesList = mutableListOf<ForumMessage>()

    fun createNewUser(userId: Int, userName: String) {
        ForumMember.createNewUser(membersList, userId, userName)
    }

    fun createNewMessage() {
    }

    fun printThread() {
    }
}

class ForumMember(
    val userId: Int,
    val userName: String,
) {
    companion object {
        fun createNewUser(membersList: MutableList<ForumMember>, userId: Int, userName: String) {
            if (!membersList.any { it.userId == userId && it.userName == userName }) {
                membersList.add(ForumMember(userId, userName))
            }
        }
    }
}

data class ForumMessage(
    val messageId: Int,
    val authorId: Int,
    val message: String,
)