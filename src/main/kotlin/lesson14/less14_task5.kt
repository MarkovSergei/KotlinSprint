package org.example.lesson14

fun main() {
    val chat = Chat()

    chat.addMessage("1", "Привет", "Вася")
    chat.addThreadMessage("1", "1", "Как дела?", "Света")
    chat.addThreadMessage("1", "2", "Нормально", "Вася")

    chat.addMessage("2", "Новая ветка", "Феокла")
    chat.addThreadMessage("2", "3", "Проверка", "Аристарх")

    chat.printChat()
}

class Chat {
    private val messages = mutableListOf<Message>()

    fun addMessage(
        id: String,
        text: String,
        author: String,
    ) {
        messages.add(Message(id, text, author))
    }

    fun addThreadMessage(
        parentMessageId: String,
        id: String,
        text: String,
        author: String
    ) {
        messages.add(ChildMessage(parentMessageId, id, text, author))
    }

    fun printChat() {
        for (message in messages) {
            if (message is ChildMessage) {
                println("\t${message.text} (автор: ${message.author})")
            } else {
                println("${message.text} (автор: ${message.author})")
            }
        }
    }
}

open class Message(
    open val id: String,
    open val text: String,
    open val author: String,
)

data class ChildMessage(
    val parentMessageId: String,
    override val id: String,
    override val text: String,
    override val author: String,
) : Message(parentMessageId, text, author)