package org.example.lesson14

fun main() {
    val chat = Chat()

    chat.addMessage("Привет!", "Вася")
    chat.addThreadMessage("1", "Как дела?", "Света")
    chat.addThreadMessage("1", "Нормально?", "Вася")

    chat.printChat()
}

class Chat {
    private val messages = mutableListOf<Message>()

    fun addMessage(text: String, author: String) {
        messages.add(Message(text, author))
    }

    fun addThreadMessage(parentMessageId: String, text: String, author: String) {
        messages.add(ChildMessage(parentMessageId, text, author))
    }

    fun printChat() {
        for (message in messages) {
            message.run {
                if (this is ChildMessage) println("${parentMessageId}\t$this")
                else println(this)
            }
        }
    }
}

open class Message {
    constructor(text: String, author: String)
    constructor()
    open val id: String = ""
}

data class ChildMessage(
    override val id: String,
    val parentMessageId: String,
    val text: String
) : Message() {
}