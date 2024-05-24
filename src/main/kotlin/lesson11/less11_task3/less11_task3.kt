package org.example.lesson11.less11_task3

fun main() {
    val newRoom = Room(
        cover = "Общаемся голосом",
        name = "Чат",
    )

    newRoom.addNewOnlineUser(
        OnlineUser(
            "Аватарка1",
            "Вася",
            "Микрофон выключен"
        )
    )

    newRoom.addNewOnlineUser(
        OnlineUser(
            "Аватарка2",
            "Петя",
            "Разговаривает"
        )
    )

    printRoomInfo(newRoom)
    newRoom.updateStatus("Вася", "Разговариевает")
    newRoom.updateStatus("Петя", "Пользователь заглушен")
    printRoomInfo(newRoom)

}

data class Room(
    val cover: String,
    val name: String,
    val onlineUsers: MutableList<OnlineUser> = mutableListOf()
) {

    fun addNewOnlineUser(onlineUser: OnlineUser) {
        onlineUsers.add(onlineUser)
    }

    fun updateStatus(user: String, status: String) {
        for (onlineUser in onlineUsers) {
            if (onlineUser.nickname == user) {
                onlineUser.status = status
                return

            }
        }

    }
}

fun printRoomInfo(room: Room) {
    println("/ ${room.name} / ${room.cover} / ${
        room.onlineUsers.joinToString(", ")
        { user -> "${user.nickname} - ${user.status}" }
    }"
    )
}

data class OnlineUser(
    val avatar: String,
    val nickname: String,
    var status: String
)