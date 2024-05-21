package org.example.lesson11.less11_task3

fun main() {
    val newRoom = Room(
        cover = "Общаемся голосом",
        name = "Чат",
    )

    newRoom.addNewOnlineUser(OnlineUser("Avatar1", "Вася", "Микрофон выключен"))
    newRoom.addNewOnlineUser(OnlineUser("Avatar2", "Петя", "Разговаривает"))

    printRoomInfo(newRoom)

    newRoom.updateStatus("Вася", "Разговаривает")

    printRoomInfo(newRoom)
}

data class Room(
    val cover: String,
    val name: String,
    var onlineUsers: List<OnlineUser> = emptyList(),
) {

    fun addNewOnlineUser(onlineUser: OnlineUser) {
        onlineUsers += onlineUser
    }

    fun updateStatus(user: String, status: String) {
        onlineUsers.first { it.nickname == user }.status = status
    }
}

data class OnlineUser(
    val avatar: String,
    val nickname: String,
    var status: String
)

fun printRoomInfo(room: Room) {
    println("/ ${room.name} / ${room.cover} / ${room.onlineUsers.joinToString(", ") 
    { user -> "${user.nickname} - ${user.status}" }}")
}