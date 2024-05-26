package org.example.lesson11.less11_task5

fun main() {
    val userId = 1
    val userName = "Вася"

    val newUser = Forum(userId, userName)

}

class Forum(
    userId: Int,
    userName: String
) {


    val forumMember = ForumMember(userId, userName)
    fun createNewMessage() {
    }

    fun printThread() {

    }
}

data class ForumMember(
    val userId: Int,
    val userName: String,
) {
    private val usersList = mutableListOf(userId, userName)

    fun createNewUser() {
    }

}

data class ForumMessage(
    val authorId: Int,
    val message: String,
)

