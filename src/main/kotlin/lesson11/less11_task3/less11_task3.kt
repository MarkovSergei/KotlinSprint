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
        val onlineUser = onlineUsers.find { it.nickname == user }
        if (onlineUser != null) {
            onlineUser.status = status
        }
    }
}

fun printRoomInfo(room: Room) {
    val name = "/ ${room.name}"
    val cover = "/ ${room.cover} / "
    val usersString = room.onlineUsers.joinToString(", ")
    { user -> "${user.nickname} - ${user.status}" }
    println("$name $cover $usersString")
}

data class OnlineUser(
    val avatar: String,
    val nickname: String,
    var status: String
)